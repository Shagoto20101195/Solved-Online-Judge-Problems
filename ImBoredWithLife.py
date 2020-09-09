s = input().split(" ")
a = int(s[0])
b = int(s[1])

min = min(a, b)
ans = 1
for i in range(2, min+1):
    ans *= i

print(ans)