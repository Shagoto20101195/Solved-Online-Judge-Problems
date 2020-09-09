t = int(input())
for x in range(0, t):
    s = input().split(" ")
    arr1 = input().split(" ")
    arr2 = input().split(" ")
    
    check = False
    ans = None
    for i in range(0, len(arr1)):
        if(check == False):
            for j in range(0, len(arr2)):
                if(arr1[i] == arr2[j]):
                    check = True
                    ans = arr1[i]
                    break
        else:
            break
    
    if(check):
        print("YES")
        print("1",ans)
    else:
        print("NO")
