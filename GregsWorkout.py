# Written by Shagoto

n = int(input())
arr = list(map(int, input().split(" ")))
chest = 0
bicep = 0
back = 0

for x in range(n):
    if(x % 3 == 0):
        chest += arr[x]
    elif(x % 3 == 1):
        bicep += arr[x]
    else:
        back += arr[x]

if(chest == max(chest, bicep, back)):
    print("chest")
elif(bicep == max(chest, bicep, back)):
    print("biceps")
else:
    print("back")