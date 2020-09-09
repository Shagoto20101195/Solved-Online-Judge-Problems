# Written by Shagoto

n = int(input())
my_dict = {}

for x in range(n):
    s = input()
    
    if(s in my_dict):
        print(s + str(my_dict.get(s) + 1))
        my_dict[s] = my_dict.get(s) + 1
    else:
        print("OK")
        my_dict[s] = 0