t = int(input())
for x in range(1, t+1):
    temp = input().split(" ")
    a = int(temp[0])
    b = int(temp[1])
    n = int(temp[2])
    s = int(temp[3])
    
    if(s > a*n + b):
        print("No")
    elif(b >= s):
        print("Yes")
    elif(a*n == s):
        print("Yes")
    elif(a*n + b == s):
        print("Yes")
    else:
        temp = s // n * n
        if(b >= s - temp):
            print("Yes")
        else:
            print("No")