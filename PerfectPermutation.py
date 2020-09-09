# Written By Shagoto

n = int(input())

if(n % 2 == 1):
    print(-1)
else:
    for x in range(1, n+1):
        if(x % 2 == 0):
            print(x - 1, end = " ")
        else:
            print(x + 1, end = " ")