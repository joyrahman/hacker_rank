#!/bin/python

# Complete the function below.


def maxXor(l, r):
    xor = l ^ r

    sum = 0
    n = 0

    while sum < xor:
        sum += pow(2, n)
        n += 1

    return pow(2, n) - 1

_l = int(raw_input());

_r = int(raw_input());

res = maxXor(_l, _r);
print(res)