t = int(input())

for _ in range(t):
    s = input().split()
    n = int(s[0])
    k = int(s[1])

    if(k==1):
        print("YES")
    else:
        if(n%2==0):
            print("YES")
        else:
            if(n>=k and (k%2==1)):
                print("YES")
            else:
                print("NO")
        # if(k%2==0):
        #     if(n%2==0):
        #         print("YES")
        #     else:
        #         print("NO")
        # if(k%2==1):
        #     if(n%2==0):
        #         if(n>=2*k):
        #             print("YES")
        #         else:
        #             print("NO")
        #     if(n%2==1):
        #         if(n>=k):
        #             print("YES")
        #         else:
        #             print("NO")
    
    # print(n)
    # print(k)
