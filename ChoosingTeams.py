l1 = input().split(" ")
n = int(l1[0])
k = int(l1[1])

l2 = input().split(" ")
l2.sort()
count = 0
for i in l2:
    temp = int(i)
    if(temp + k <= 5):
        count += 1
        
print(count // 3)