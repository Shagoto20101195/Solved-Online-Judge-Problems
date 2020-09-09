# Written by Shagoto

import math

t = int(input())
for x in range(t):
    n = int(input())
    
    pSum = n * (n + 1) // 2
    temp = math.log2(n) // math.log2(2)
    temp = int(temp) + 1
    nSum = 2**temp - 1
    print(pSum - (2 * nSum))