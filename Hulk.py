# Written by Shagoto

t = int(input())
for x in range(t):
    if(x % 2 == 0):
        print("I hate", end = " ")
        if(x != t-1):
            print("that", end = " ")
        else:
            print("it")
    elif(x % 2 == 1):
        print("I love", end = " ")
        if(x != t-1):
            print("that", end = " ")
        else:
            print("it")