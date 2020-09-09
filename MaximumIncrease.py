n = int(input())
l = input().split(" ")
for i in range(0, n):
    l[i] = int(l[i])
    
streak = 1
max_streak = 1
i = 1
while(i < n):
    if(l[i-1] < l[i]):
        streak += 1
        max_streak = max(streak, max_streak)
    else:
        streak = 1
    i += 1

print(max_streak)