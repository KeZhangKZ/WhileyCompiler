import whiley.lang.*:*

string f([int] a):
     a[0] = 5
     return str(a)

void System::main([string] args):
     b = [1,2,3]
     this.out.println(str(b))
     this.out.println(f(b))
     this.out.println(str(b))
