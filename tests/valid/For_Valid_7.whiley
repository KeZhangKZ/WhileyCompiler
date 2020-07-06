// Define a predicate type
public type pred_t is function(int)->bool

// Sum elements matching predicate
public function filter(int[] items, pred_t fn) -> (int[] rs)
ensures |rs| <= |items|:
    int n = 0
    // Determine how many
    for i in 0..|items| where n <= i:
        if fn(items[i]):
            n = n + 1
    // Allocate space
    int[] nitems = [0;n]
    int j = 0
    // Copy them over
    for i in 0..|items| where |nitems| <= |items|:
        int ith = items[i]
        if fn(ith):
            nitems[j] = ith
            j = j + 1
    // Done
    return nitems

public export method test():
    assume filter([-1,0,1,2,3],&(int x -> x > 0)) == [1,2,3]
    assume filter([-3,-2,-1],&(int x -> x >= 0)) == []
    assume filter([0,1,2,3],&(int x -> x >= 0)) == [0,1,2,3]
