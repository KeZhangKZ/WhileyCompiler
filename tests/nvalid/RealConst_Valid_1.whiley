import println from whiley.lang.System

method main(System.Console sys) => void:
    x = 12376523476123.98712345
    x = x + 0.002348976
    sys.out.println(Any.toString(x))