#Written by Shagoto

t = int(input())
for x in range(t):
    n = int(input())
    s = input()
    
    if(n == 1):
        print(s)
    
    else:
        for i in range(0, len(s), 2):
            print(s[i], end = "")
        print()