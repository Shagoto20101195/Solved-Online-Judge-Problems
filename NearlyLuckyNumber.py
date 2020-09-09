n = input()
count = 0

for i in n:
    if(i == "4" or i == "7"):
        count += 1
        
check = True
temp = count
while(count > 0):
    if(count % 10 == 7 or count % 10 == 4):
        count //= 10
    else:
        check = False
        break

if(check and temp > 0):
    print("YES")
else:
    print("NO")