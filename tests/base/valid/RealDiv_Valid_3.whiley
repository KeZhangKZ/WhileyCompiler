import whiley.lang.*:*

real g(real x):
     return x / 3

void System::main([string] args):
     this.out.println(str(g(0.234)))
