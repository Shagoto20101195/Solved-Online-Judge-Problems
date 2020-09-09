t = int(input())
for x in range(1, t+1):
    n = int(input())
    
    if(n == 1):
        print("-1")
    else:
        for i in range(0,n):
            if(i == 0):
                print(5, end = "")
            else:
                print(3, end = "")
        print()