t = int(input())
for x in range(0, t):
    n = int(input())
    s = input().split(" ")
    
    count = 0
    for i in range(0, len(s)):
        if(s[i] == "1"):
            count += 1
        else:
            break
    
    if(count == n):
        count -= 1
    
    if(count % 2 == 0):
        print("First")
    else:
        print("Second")