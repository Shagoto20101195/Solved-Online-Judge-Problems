n = int(input())
s = input()

countN = s.count("n")
countZ = s.count("z")

ans = ("1 " * countN) + ("0 " * countZ)
print(ans.strip())