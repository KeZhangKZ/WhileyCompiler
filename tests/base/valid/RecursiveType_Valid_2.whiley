import whiley.lang.*:*

define binop as {int op, expr left, expr right}
define expr as int | binop

void System::main([string] args):
    e = 123
    this.out.println(str(e))
