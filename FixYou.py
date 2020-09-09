t = int(input())
for x in range(t):
    s = input().split(" ")
    n = int(s[0])
    m = int(s[1])
    count = 0
    
    l = []
    for i in range(n):
        l.append(input())
    
    for i in range(n):
        if(i == n-1):
            count += l[i].count("D")
        else:
            if(l[i][m-1] == "R"):
                count += 1
    print(count)