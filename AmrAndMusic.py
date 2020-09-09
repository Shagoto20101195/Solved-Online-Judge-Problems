#Written by Shagoto

n, k = map(int, input().split(" "))
arr = list(map(int, input().split(" ")))
temp = arr.copy()
temp.sort()

ans = []
total = 0
for x in range(n):
    total += temp[x]
    if(total <= k):
        ans.append(arr.index(temp[x]))
        arr[arr.index(temp[x])] = 10000

print(len(ans))
for x in ans:
    print(x+1, end = " ")