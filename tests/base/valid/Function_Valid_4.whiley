import whiley.lang.*:*

define fr4nat as int

fr4nat g(fr4nat x):
    return x + 1

string f(fr4nat x):
    return str(x)

void System::main([string] args):
    y = 1
    this.out.println(f(g(y)))
