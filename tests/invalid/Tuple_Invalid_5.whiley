type nat is (int n) where n >= 0

type pair is {nat first, int second}

function get(pair p) -> (int f, int s):
    return p.first, p.second

function min(pair p) -> int:
    int x
    int y
    (x,y) = get(p)
    if x > y:
        return y
    else:
        return x

public export method test() -> int:
    return min({first: -1, second: 1})
