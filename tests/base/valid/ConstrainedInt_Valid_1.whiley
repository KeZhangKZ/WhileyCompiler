import whiley.lang.*:*

// this is a comment!
define cr1nat as int

string f(cr1nat x):
    y = x
    return str(y)

void System::main([string] args):
    this.out.println(f(9))
