import whiley.lang.*:*

// this is a comment!
define IntReal as int | real

int f(int x):
    return x

void System::main([string] args):
    if |args| > 0:
        x = 1.23
    else:
        x = 1
    this.out.println(str(x))
    f(x)

