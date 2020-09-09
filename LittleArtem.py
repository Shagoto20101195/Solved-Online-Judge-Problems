t = int(input())
for x in range(0, t):
    s = input().split(" ")
    n = int(s[0])
    m = int(s[1])
    
    for i in range(0, n):
        for j in range(0, m):
            if(i == 0 and j == 0):
                print("W", end = "")
            else:
                print("B", end = "")
        print()