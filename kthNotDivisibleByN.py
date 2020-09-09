#Written by Shagoto

t = int(input())
for x in range(t):
    n, k = map(int, input().split(" "))
    
    if(k < n):
        print(k)
    elif(n == k):
        print(k + 1)
    else:
        print(k + (k-1)//(n-1))