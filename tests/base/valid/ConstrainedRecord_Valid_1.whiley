import whiley.lang.*:*

define RET as 169
define NOP as 0

define unitCode as { NOP, RET }
define UNIT as {unitCode op}

[int] f(UNIT x):
    return [x.op]

void System::main([string] args):
    bytes = f({op:NOP})
    this.out.println(str(bytes))

