import whiley.lang.*:*

int f(int x) ensures $ > x:
    x = x + 1
    return x

void System::main([string] args):
    y = f(1)
    this.out.println(str(y))
    
