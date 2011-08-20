import whiley.lang.*:*

define pos as int where $ > 0
define neg as int where $ < 0

define intlist as pos|neg|[int]

int f(intlist x):
    if x is int:
        return x
    return 1 

void System::main([string] args):
    x = f([1,2,3])
    this.out.println(str(x))
    x = f(123)
    this.out.println(str(x))

