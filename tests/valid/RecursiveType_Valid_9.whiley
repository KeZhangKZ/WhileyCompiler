

type nat is int

type expr is nat | {int op, expr left, expr right}

public export method test() -> void:
    expr e = 14897
    assert e == 14897
