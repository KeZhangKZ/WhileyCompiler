function swap2(int x, int y) -> (int r, int s)
    ensures true:
    assume x == 10
    assume y == 11
    x = 2 * x + y   // x = 20 +11 = 31
    y = x - y       // y = 31 - 11 = 20
    x = x - y       // x = 31 - 20 = 11
    assert x == 11 && y == 2 * 10
    return x, y

public export method test() -> (int x, int y):
    //
    (int a, int b) = swap2(10,11)
    //
    return (a,b)
    //assume a == 11 && b == 2*10