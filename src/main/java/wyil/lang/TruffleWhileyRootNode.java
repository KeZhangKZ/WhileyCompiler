package wyil.lang;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import wybs.lang.SyntacticException;
import wybs.util.AbstractCompilationUnit;
import wyc.lang.WhileyFile;
import wyc.util.TestUtils;
import wyfs.lang.Path;
import wyfs.util.DirectoryRoot;
import wyil.interpreter.ConcreteSemantics;
import wyil.interpreter.Interpreter;
import wyil.lang.WyilFile.Decl;

import java.io.File;
import java.io.IOException;

public class TruffleWhileyRootNode extends RootNode {
    private Interpreter interpreter;
    private WyilFile.QualifiedName name;
    private WyilFile.Type.Method sig;
    private Interpreter.CallStack stack;

    @Child
    private Decl.Callable lambda;

//    @Child
//    private TruffleWhileyNode.DeclNode.MethodNode root;

//    @Child
//    private CompleteTruffleWhileyNode.DeclNode.MethodNode root;

    public TruffleWhileyRootNode(TruffleLanguage<?> language) {
        super(language);
//        System.out.println("create root");
    }

//    @Override
//    public Object execute(VirtualFrame frame) {
//        System.out.println("execute!");
//        return 0;
//    }


    public TruffleWhileyRootNode(TruffleLanguage<?> language, File wyildir, Path.ID id) throws IOException {
        super(language);
//        System.out.println("start creating root");
        execWyil(wyildir, id);
//        System.out.println("finish creating root");
    }

    public void execWyil(File wyildir, Path.ID id) throws IOException {
        Path.Root root = new DirectoryRoot(wyildir, new TestUtils.Registry());
        // Empty signature
        this.sig = new WyilFile.Type.Method(WyilFile.Type.Void, WyilFile.Type.Void);
//                WyilFile.Type.Int);
//                WyilFile.Type.Tuple.create(new WyilFile.Type.Int[]{WyilFile.Type.Int, WyilFile.Type.Int}));
        this.name = new WyilFile.QualifiedName(new AbstractCompilationUnit.Name(id), new AbstractCompilationUnit.Identifier("test"));
        // Try to run the given function or method
        this.interpreter = new Interpreter(System.out);
        // Create the initial stack
        this.stack = interpreter.new CallStack();
        //
        try {
            // Load the relevant WyIL module
            stack.load(root.get(id, WyilFile.ContentType).read());
            // Sanity check modifiers on test method
            this.lambda = stack.getCallable(name, sig);

            if (lambda == null) {
                throw new IllegalArgumentException("no function or method found: " + name + ", " + sig);
            }
//            else if (lambda.getParameters().size() != args.length) {
//                throw new IllegalArgumentException(
//                "incorrect number of arguments: " + lambda.getName() + ", " + lambda.getType());
//            }
            // Sanity check target has correct modifiers.
            if (lambda.getModifiers().match(WyilFile.Modifier.Export.class) == null
                    || lambda.getModifiers().match(WyilFile.Modifier.Public.class) == null) {
                Path.Entry<WhileyFile> srcfile = root.get(id, WhileyFile.ContentType);
                new SyntacticException("test method must be exported and public", srcfile, lambda)
                        .outputSourceError(System.out, false);
                throw new RuntimeException("test method must be exported and public");
            }
//            this.root = new TruffleWhileyNode.DeclNode.MethodNode((Decl.Method) lambda);
//            this.root = new CompleteTruffleWhileyNode.DeclNode.MethodNode((Decl.Method) lambda);
//            else {
//                // traverse AST and generate Truffle AST.
//                return lambda;
//                //
////                ConcreteSemantics.RValue returns = interpreter.execute(name, sig, stack);
//                // Print out any return values produced
//                // if (returns != null) {
//                // System.out.println(returns);
//                // }
//            }
        } catch (Interpreter.RuntimeError e) {
            Path.Entry<WhileyFile> srcfile = root.get(id,WhileyFile.ContentType);
            // FIXME: this is a hack based on current available API.
            new SyntacticException(e.getMessage(), srcfile, e.getElement()).outputSourceError(System.out, false);
            throw e;
        }
    }

    @Override
    public Object execute(VirtualFrame frame) {
//        System.out.println("execute!");
        try {
//            ConcreteSemantics.RValue returns = interpreter.execute(root, stack, false);
//            ConcreteSemantics.RValue returns = interpreter.execute(root, stack, true);
            ConcreteSemantics.RValue returns = interpreter.execute(name, sig, stack);
//            System.out.println("########Result########");
//            System.out.println(returns);
//            System.out.println("######################");
        } catch (Error error) {
            return false;
        }
        return 0;
    }
}
