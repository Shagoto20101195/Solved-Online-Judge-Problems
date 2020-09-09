s = input()
upper = 0
lower = 0

for i in s:
    if(ord(i) >= 65 and ord(i) <= 90):
        upper += 1
    else:
        lower += 1
        
if(upper == len(s)):
    print(s.lower())
elif(ord(s[0]) >= 97 and ord(s[0]) <= 122 and lower == 1):
    print(s[0].upper(), end = "")
    for i in range(1, len(s)):
        print(s[i].lower(), end = "")
else:
    print(s)