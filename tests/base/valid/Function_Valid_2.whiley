import whiley.lang.*:*

define fr2nat as int

string f(fr2nat x):
    return str(x)

void System::main([string] args):
    y = 1
    this.out.println(f(y))
