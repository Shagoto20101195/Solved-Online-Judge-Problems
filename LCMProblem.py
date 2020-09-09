t = int(input())
for x in range(0, t):
    s = input().split(" ")
    a = int(s[0])
    b = int(s[1])
    if(2*a > b):
        print("-1 -1")
    elif(b % a == 0):
        print(a,b)
    else:
        print(a,(2*a))