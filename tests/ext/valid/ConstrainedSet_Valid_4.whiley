import whiley.lang.*:*

define pintset as {int} where |$| > 1

void System::main([string] args):
    p = {1,2}
    this.out.println(str(p))
