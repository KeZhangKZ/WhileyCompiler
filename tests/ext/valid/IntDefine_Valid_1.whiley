import whiley.lang.*:*

// this is a comment!
define ir1nat as int where $ > 0
define pir1nat as ir1nat where $ > 1

string f(int x):
    if x > 2:
        y = x
        return str(y)
    return ""

void System::main([string] args):
    this.out.println(f(1))
    this.out.println(f(2))
    this.out.println(f(3))
