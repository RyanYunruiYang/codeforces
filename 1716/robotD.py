t = int(input())
for o in range(t):
    m = int(input())
    a = [0 for i in range(2)]
    a[0] = [int(x) for x in input().split()]
    a[1] = [int(x) for x in input().split()]

    # print(a)
    # print(f"a[0][1]: {a[0][1]}")

    mintime = 10**9
    for k in range(m):
        # print(f"k: {k}")
        maxblock = 0

        blocks = []
        for i in range(k):
            # print(f"i: {i}")
            # blocks.append(a[0][i]+(2*m-1) - (2*i + (i%2)))
            # blocks.append(a[1][i]+(2*m-1) - (2*i + ((i+1)%2)))
            if(a[0][i]+(2*m-1) - (2*i + (i%2))>maxblock):
                maxblock = a[0][i]+(2*m-1) - (2*i + (i%2))
                # if(2*i+(i%2)>= a[0][i]):
                #     maxblock+=1

            if(a[1][i]+(2*m-1) - (2*i + ((i+1)%2))>maxblock):
                maxblock = a[1][i]+(2*m-1) - (2*i + ((i+1)%2))
                # if((2*i + ((i+1)%2)) >= a[1][i]):
                #     maxblock+=1

        for i in range(k,m):
            # blocks.append(a[k%2][i] + 2*m-i-1-k)
            # blocks.append(a[(k+1)%2][i] + i-k)
            if(a[k%2][i] + 2*m-1-i-2*k > maxblock):
                maxblock = a[k%2][i] + 2*m-1-i-k
                # if(i+k >= a[k%2][i]):
                #     maxblock+=1
            if(a[(k+1)%2][i] + i-k > maxblock):
                maxblock = a[(k+1)%2][i] + i-k
                # if(2*m-1-i+k >= a[(k+1)%2][i]):
                #     maxblock+=1
            # if(k%2==0):
            #     if(a[0][i] + 2*m-1-i-2*k > maxblock):
            #         maxblock = a[0][i] + 2*m-1-i-2*k
            #     if(a[1][i] + i-k > maxblock):
            #         maxblock = a[1][i] + i-k
            # else:
        # maxblock = max(blocks)
        if(2*m-2 =< max(max(a[0]), max(a[1]))):
            maxblock+=1

        # print(maxblock)
        if(maxblock<mintime):
            mintime= maxblock
    # print("mintime: ")
    print(mintime)
