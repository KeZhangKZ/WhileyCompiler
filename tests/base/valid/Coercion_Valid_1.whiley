import whiley.lang.*:*

real f(int x):
    return x

void System::main([string] args):
    this.out.println(str(f(123)))