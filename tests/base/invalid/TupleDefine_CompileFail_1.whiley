import whiley.lang.*:*

define point as {real x,real y}

int f(int x):
    return x

void System::main([string] args):
     p = {x:1.0,y:2.23}
     x = f(p.y)
     this.out.println(str(x))

