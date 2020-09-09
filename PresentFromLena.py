n = int(input())

for i in range(1, n+2):
    for j in range(n, i-1, -1):
        print(" ", end = " ")
    for j in range(0, i):
        if(j == 0 and i == 1):
            print(j, end = "")
        else:
            print(j, end = " ")
    for j in range(i-2, -1, -1):
        if(j == 0):
            print(j, end = "")
        else:
            print(j, end = " ")
    print()
    
for i in range(1, n+1):
    for j in range(1, i+1):
        print(" ", end = " ")
    for j in range(0, n-i+1):
        if(j == 0 and i == n):
            print(j, end = "")
        else:
            print(j, end = " ")
    for j in range(n-i-1, -1, -1):
        if(j == 0):
            print(j, end = "")
        else:
            print(j, end = " ")
    print()