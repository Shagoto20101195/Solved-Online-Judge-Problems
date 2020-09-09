s = input().split(" ")
n1 = int(s[0])
n2 = int(s[1])
n3 = int(s[2])
n4 = int(s[3])
n5 = int(s[4])

if((n1 + n2 + n3 + n4 + n5) % 5 == 0 and (n1 + n2 + n3 + n4 + n5) != 0):
    print((n1 + n2 + n3 + n4 + n5) // 5)
else:
    print(-1)