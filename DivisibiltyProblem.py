# Written by Shagoto

t = int(input())
for x in range(t):
    a, b = map(int, input().split(" "))
    
    if(a // b * b == a):
        print(0)
    else:
        print((a // b + 1) * b - a)