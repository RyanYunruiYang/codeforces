t = int(input())
for o in range(t):
    n=int(input())
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]
    # print(a)
    # print(b)


    curb = 0
    for i in range(n):
        while(b[curb]<a[i]):
            curb+=1
        print(b[curb] - a[i], end=' ')
    print()




    laststop = 0
    for i in range(n-1):
        # print(f"i: {i}")
        if(b[i] < a[i+1]):
            for j in range(laststop,i+1):
                print(b[i] - a[j], end=' ')
            laststop = i+1
        # print()

    # print(f"laststop: {laststop}")

    for j in range(laststop,n):
        print(b[n-1] - a[j], end=' ')
    print()
