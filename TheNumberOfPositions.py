arr = input().split(" ")
n = int(arr[0])
a = int(arr[1])
b = int(arr[2])


count = 0
temp1 = 0
temp2 = n - 1
for i in range(1, n+1):
    if(temp1 >= a and temp2 <= b):
        count += 1
    temp1 += 1
    temp2 -= 1
print(count)