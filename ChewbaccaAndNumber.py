#Written by Shagoto

s = input()
ans = ""
i = 0
for x in s:
    n = int(x)
    min_val = min(n, 9-n)
    if(min_val == 0 and i == 0):
        print(n, end = "")
    else:
        print(min_val, end = "")
    i = 1