# Written by Shagoto

count = 0
t = int(input())
for x in range(t):
    n = input()
    
    if(n == "X++" or n == "++X"):
        count += 1
    else:
        count -= 1

print(count)