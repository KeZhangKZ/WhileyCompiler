import whiley.lang.*:*

[int] extract([int] ls, [int] rs):
    i = 0
    r = [1]
    // now do the reverse!
    while i < |ls| where |r| > 0:
        r = rs
        i = i + 1
    return r

void System::main([string] args):
    rs = extract([-2,-3,1,2,-23,3,2345,4,5],[])
    debug str(rs)
