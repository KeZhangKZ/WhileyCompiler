package wycs.transforms;

import java.util.*;

import static wybs.lang.SyntaxError.*;
import wybs.lang.Builder;
import wybs.lang.NameID;
import wybs.lang.SyntacticElement;
import wybs.lang.Transform;
import wybs.util.Pair;
import wybs.util.ResolveError;
import wycs.lang.*;
import wycs.WycsBuilder;

public class TypePropagation implements Transform<WycsFile> {
	
	/**
	 * Determines whether type propagation is enabled or not.
	 */
	private boolean enabled = getEnable();

	private final WycsBuilder builder;
	
	private String filename;

	// ======================================================================
	// Constructor(s)
	// ======================================================================

	public TypePropagation(Builder builder) {
		this.builder = (WycsBuilder) builder;
	}
	
	// ======================================================================
	// Configuration Methods
	// ======================================================================
		
	public static String describeEnable() {
		return "Enable/disable type propagation";
	}

	public static boolean getEnable() {
		return true; // default value
	}

	public void setEnable(boolean flag) {
		this.enabled = flag;
	}

	// ======================================================================
	// Apply method
	// ======================================================================
		
	public void apply(WycsFile wf) {
		if(enabled) {
			this.filename = wf.filename();

			for (WycsFile.Declaration s : wf.declarations()) {
				propagate(s);
			}
		}
	}

	private void propagate(WycsFile.Declaration s) {		
		if(s instanceof WycsFile.Function) {
			propagate((WycsFile.Function)s);
		} else if(s instanceof WycsFile.Define) {
			propagate((WycsFile.Define)s);
		} else if(s instanceof WycsFile.Assert) {
			propagate((WycsFile.Assert)s);
		} else if(s instanceof WycsFile.Import) {
			
		} else {
			internalFailure("unknown statement encountered (" + s + ")",
					filename, s);
		}
	}
	
	private void propagate(WycsFile.Function s) {
		if(s.constraint != null) {
			HashSet<String> generics = new HashSet<String>(s.generics);
			HashMap<String,SemanticType> environment = new HashMap<String,SemanticType>();
			addNamedVariables(s.from, environment,generics);
			addNamedVariables(s.to, environment,generics);
			SemanticType r = propagate(s.constraint,environment,generics,s);
			checkIsSubtype(SemanticType.Bool,r,s.constraint);		
		}
	}
	
	private void propagate(WycsFile.Define s) {
		HashSet<String> generics = new HashSet<String>(s.generics);
		HashMap<String,SemanticType> environment = new HashMap<String,SemanticType>();		
		addNamedVariables(s.from, environment,generics);
		SemanticType r = propagate(s.condition,environment,generics,s);
		checkIsSubtype(SemanticType.Bool,r,s.condition);		
	}
		
	private void addNamedVariables(TypePattern type,
			HashMap<String, SemanticType> environment, HashSet<String> generics) {

		if (type.var != null) {
			if (environment.containsKey(type.var)) {
				internalFailure("duplicate variable name encountered",
						filename, type);
			}
			environment
					.put(type.var, convert(type.toSyntacticType(), generics));
		}

		if (type instanceof TypePattern.Tuple) {
			TypePattern.Tuple st = (TypePattern.Tuple) type;
			for (TypePattern t : st.patterns) {
				addNamedVariables(t, environment, generics);
			}
		}
	}
	
	private void propagate(WycsFile.Assert s) {
		HashMap<String,SemanticType> environment = new HashMap<String,SemanticType>();
		SemanticType t = propagate(s.expr, environment, new HashSet<String>(), s);
		checkIsSubtype(SemanticType.Bool,t, s.expr);
	}
	
	private SemanticType propagate(Expr e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		SemanticType t;
		if(e instanceof Expr.Variable) {
			t = propagate((Expr.Variable)e, environment, generics, context);
		} else if(e instanceof Expr.Constant) {
			t = propagate((Expr.Constant)e, environment, generics, context);
		} else if(e instanceof Expr.Unary) {
			t = propagate((Expr.Unary)e, environment, generics, context);
		} else if(e instanceof Expr.Binary) {
			t = propagate((Expr.Binary)e, environment, generics, context);
		} else if(e instanceof Expr.Nary) {
			t = propagate((Expr.Nary)e, environment, generics, context);
		} else if(e instanceof Expr.Quantifier) {
			t = propagate((Expr.Quantifier)e, environment, generics, context);
		} else if(e instanceof Expr.FunCall) {
			t = propagate((Expr.FunCall)e, environment, generics, context);
		} else if(e instanceof Expr.TupleLoad) {
			t = propagate((Expr.TupleLoad)e, environment, generics, context);
		} else {
			internalFailure("unknown expression encountered (" + e + ")",
					filename, e);
			return null;
		}
		e.attributes().add(new TypeAttribute(t));
		return t;
	}
	
	private SemanticType propagate(Expr.Variable e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		SemanticType t = environment.get(e.name);
		if(t == null) {
			internalFailure("undeclared variable encountered (" + e + ")",
					filename, e);
		}
		return t;
	}
	
	private SemanticType propagate(Expr.Constant e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		return e.value.type();
	}

	private SemanticType propagate(Expr.Unary e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		SemanticType op_type = propagate(e.operand,environment,generics,context);
		
		switch(e.op) {
		case NOT:
			checkIsSubtype(SemanticType.Bool,op_type,e);
			return op_type;
		case NEG:
			checkIsSubtype(SemanticType.IntOrReal,op_type,e);
			return op_type;
		case LENGTHOF:
			checkIsSubtype(SemanticType.SetAny,op_type,e);
			return SemanticType.Int;		
		}
		
		internalFailure("unknown unary expression encountered (" + e + ")",
				filename, e);
		return null; // deadcode
	}
	
	private SemanticType propagate(Expr.TupleLoad e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		SemanticType op_type = propagate(e.operand,environment,generics,context);
		if(!(op_type instanceof SemanticType.Tuple)) {			
			syntaxError("expecting tuple type, got: " + op_type,filename,e.operand);
		}
		SemanticType.Tuple tt = (SemanticType.Tuple) op_type;
		if(e.index < 0) {
			syntaxError("negative tuple access",filename,e.operand);
		} else if(tt.elements().length <= e.index) {
			syntaxError("tuple access out of bounds",filename,e.operand);
		} 
		return tt.element(e.index);
	}
	
	private SemanticType propagate(Expr.Binary e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		SemanticType lhs_type = propagate(e.leftOperand,environment,generics,context);
		SemanticType rhs_type = propagate(e.rightOperand,environment,generics,context);
		
		switch(e.op) {
		case ADD:
		case SUB:
		case MUL:
		case DIV:
		case REM:
			checkIsSubtype(SemanticType.IntOrReal,lhs_type,e.leftOperand);
			checkIsSubtype(SemanticType.IntOrReal,rhs_type,e.rightOperand);
			return SemanticType.Or(lhs_type,rhs_type);
		case EQ:
		case NEQ:
			return SemanticType.Bool;
		case IMPLIES:
		case IFF:
			checkIsSubtype(SemanticType.Bool,lhs_type,e.leftOperand);
			checkIsSubtype(SemanticType.Bool,rhs_type,e.rightOperand);
			return SemanticType.Bool;
		case LT:
		case LTEQ:
		case GT:
		case GTEQ:
			checkIsSubtype(SemanticType.IntOrReal,lhs_type,e.leftOperand);
			checkIsSubtype(SemanticType.IntOrReal,rhs_type,e.rightOperand);
			return SemanticType.Bool;
		case IN: {
			checkIsSubtype(SemanticType.SetAny,rhs_type,e.rightOperand);
			SemanticType.Set s = (SemanticType.Set) rhs_type;
			checkIsSubtype(s.element(),lhs_type,e.leftOperand);
			return SemanticType.Bool;
		}
		case SUBSET:
		case SUBSETEQ:
		case SUPSET:
		case SUPSETEQ:
			checkIsSubtype(SemanticType.SetAny,lhs_type,e.leftOperand);
			checkIsSubtype(SemanticType.SetAny,rhs_type,e.rightOperand);
			return SemanticType.Bool;				
		}
		
		internalFailure("unknown binary expression encountered (" + e + ")",
				filename, e);
		return null; // deadcode
	}
	
	private SemanticType propagate(Expr.Nary e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		Expr[] e_operands = e.operands;
		SemanticType[] op_types = new SemanticType[e_operands.length];
		
		for(int i=0;i!=e_operands.length;++i) {
			op_types[i] = propagate(e_operands[i],environment,generics,context);
		}
		
		switch(e.op) {
		case AND:
		case OR:
			for(int i=0;i!=e_operands.length;++i) {
				checkIsSubtype(SemanticType.Bool,op_types[i],e_operands[i]);
			}
			return SemanticType.Bool;
		case SET:
			return SemanticType.Set(SemanticType.Or(op_types));
		case TUPLE:
			return SemanticType.Tuple(op_types);
		}
		
		internalFailure("unknown nary expression encountered (" + e + ")",
				filename, e);
		return null; // deadcode
	}
	
	private SemanticType propagate(Expr.Quantifier e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		environment = new HashMap<String,SemanticType>(environment);
		Pair<TypePattern,Expr>[] e_variables = e.variables;
		
		for (int i = 0; i != e_variables.length; ++i) {
			Pair<TypePattern,Expr> p = e_variables[i];
			TypePattern pattern = p.first();
			SemanticType src_t = convert(pattern.toSyntacticType(),generics);
			Expr src = p.second();
			if(src != null) {
				SemanticType t = propagate(p.second(),environment,generics,context);
				checkIsSubtype(SemanticType.Set(src_t),t,p.second());
				SemanticType.Set st = (SemanticType.Set) t;				
			} 
			addNamedVariables(p.first(), environment, generics);
		}
		
		SemanticType r = propagate(e.operand,environment,generics,context);
		checkIsSubtype(SemanticType.Bool,r,e.operand);
		
		return SemanticType.Bool;
	}
	
	private SemanticType propagate(Expr.FunCall e,
			HashMap<String, SemanticType> environment,
			HashSet<String> generics, WycsFile.Context context) {
		
		ArrayList<String> fn_generics;
		SemanticType parameter;
		SemanticType ret;
		
		try {			
			Pair<NameID,WycsFile.Function> p = builder.resolveAs(e.name,WycsFile.Function.class,context);
			WycsFile.Function fn = p.second();
			fn_generics = fn.generics;
			SemanticType.Tuple funType = getFunctionType(fn);
			parameter = funType.element(0);
			ret = funType.element(1);
		} catch(ResolveError re) {
			// This indicates we couldn't find a function with the corresponding
			// name. But, we don't want to give up just yet. It could be a macro
			// definition!
			try { 
				Pair<NameID,WycsFile.Define> p = builder.resolveAs(e.name,WycsFile.Define.class,context);
				WycsFile.Define dn = p.second();
				fn_generics = dn.generics;
				parameter = getDefinitionType(dn);
				ret = SemanticType.Bool;
			} catch(ResolveError err2) {
				syntaxError("cannot resolve as function or definition", context.file().filename(), e);
				return null;
			}
		}
		if (fn_generics.size() != e.generics.length) {
			// could resolve this with inference in the future.
			syntaxError(
					"incorrect number of generic arguments provided (got "
							+ e.generics.length + ", required "
							+ fn_generics.size() + ")", context.file()
							.filename(), e);
		}
			
		SemanticType argument = propagate(e.operand, environment, generics,
				context);
		HashMap<String, SemanticType> binding = new HashMap<String, SemanticType>();

		for (int i = 0; i != e.generics.length; ++i) {
			binding.put(fn_generics.get(i), convert(e.generics[i], generics));
		}

		parameter = parameter.substitute(binding);
		ret = ret.substitute(binding);

		checkIsSubtype(parameter, argument, e.operand);
		return ret;	
	}
	
	private SemanticType.Tuple getFunctionType(WycsFile.Function fn) {
		TypeAttribute typeAttr = fn.attribute(TypeAttribute.class);
		if(typeAttr == null) {
			// No type attribute on the given function declaration. Therefore,
			// create one and it to the declaration's attributes.
			HashSet<String> generics = new HashSet<String>(fn.generics);
			SemanticType from = convert(fn.from.toSyntacticType(),generics);
			SemanticType to = convert(fn.to.toSyntacticType(),generics);
			typeAttr = new TypeAttribute(SemanticType.Tuple(from,to));
			fn.attributes().add(typeAttr);
		}
		return (SemanticType.Tuple) typeAttr.type;
	}
	
	private SemanticType getDefinitionType(WycsFile.Define fn) {
		TypeAttribute typeAttr = fn.attribute(TypeAttribute.class);
		if(typeAttr == null) {
			// No type attribute on the given function declaration. Therefore,
			// create one and it to the declaration's attributes.
			HashSet<String> generics = new HashSet<String>(fn.generics);
			SemanticType from = convert(fn.from.toSyntacticType(),generics);
			typeAttr = new TypeAttribute(from);
			fn.attributes().add(typeAttr);
		}
		return typeAttr.type;
	}
	
	/**
	 * <p>
	 * Convert a syntactic type into a semantic type. A syntactic type
	 * represents something written at the source-level which may be invalid, or
	 * not expressed in the minial form.
	 * </p>
	 * <p>
	 * For example, consider a syntactic type <code>int | !int</code>. This is a
	 * valid type at the source level, and appears to be a union of two types.
	 * In fact, semantically, this type is equivalent to <code>any</code> and,
	 * for the purposes of subtype testing, needs to be represented as such.
	 * </p>
	 * 
	 * 
	 * @param type
	 *            --- Syntactic type to be converted.
	 * @param generics
	 *            --- Set of declared generic variables.
	 * @return
	 */
	private SemanticType convert(SyntacticType type, Set<String> generics) {
		
		if (type instanceof SyntacticType.Primitive) {
			SyntacticType.Primitive p = (SyntacticType.Primitive) type;
			return p.type;
		} else if (type instanceof SyntacticType.Variable) {
			SyntacticType.Variable p = (SyntacticType.Variable) type;
			if(!generics.contains(p.var)) {
				internalFailure("undeclared generic variable encountered",
						filename, type);
				return null; // deadcode		
			}
			return SemanticType.Var(p.var);
		} else if(type instanceof SyntacticType.Not) {
			SyntacticType.Not t = (SyntacticType.Not) type;
			return SemanticType.Not(convert(t.element,generics));
		} else if(type instanceof SyntacticType.Set) {
			SyntacticType.Set t = (SyntacticType.Set) type;
			return SemanticType.Set(convert(t.element,generics));
		} else if(type instanceof SyntacticType.Or) {
			SyntacticType.Or t = (SyntacticType.Or) type;
			SemanticType[] types = new SemanticType[t.elements.length];
			for(int i=0;i!=t.elements.length;++i) {
				types[i] = convert(t.elements[i],generics);
			}
			return SemanticType.Or(types);
		} else if(type instanceof SyntacticType.And) {
			SyntacticType.And t = (SyntacticType.And) type;
			SemanticType[] types = new SemanticType[t.elements.length];
			for(int i=0;i!=t.elements.length;++i) {
				types[i] = convert(t.elements[i],generics);
			}
			return SemanticType.And(types);
		} else if(type instanceof SyntacticType.Tuple) {
			SyntacticType.Tuple t = (SyntacticType.Tuple) type;
			SemanticType[] types = new SemanticType[t.elements.length];
			for(int i=0;i!=t.elements.length;++i) {
				types[i] = convert(t.elements[i],generics);
			}
			return SemanticType.Tuple(types);
		}
		
		internalFailure("unknown syntactic type encountered",
				filename, type);
		return null; // deadcode
	}
	
	/**
	 * Check that t1 :> t2 or, equivalently, that t2 is a subtype of t1. A type
	 * <code>t1</code> is said to be a subtype of another type <code>t2</code>
	 * iff the semantic set described by <code>t1</code> contains that described
	 * by <code>t2</code>.
	 * 
	 * @param t1
	 *            --- Semantic type that should contain <code>t2</code>.
	 * @param t2
	 *            --- Semantic type that shold be contained by <code>t1/code>.
	 * @param element
	 *            --- Syntax error is reported against this element if
	 *            <code>t1</code> does not contain <code>t2</code>.
	 */
	private void checkIsSubtype(SemanticType t1, SemanticType t2, SyntacticElement element) {
		if(!SemanticType.isSubtype(t1,t2)) {
			syntaxError("expected type " + t1 + ", got type " + t2,filename,element);
		}
	}
}