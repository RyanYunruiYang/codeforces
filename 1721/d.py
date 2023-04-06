import random

def kth(x,k):
    return ((x>>k) % 2)

def canget(a,b,candk, curKs, curKindex):
    n = len(a)
    A=[[],[]]
    B=[[],[]]

    if(curKindex < len(curKs)):
        k = curKs[curKindex]
        for i in range(n):
            A[kth(a[i],k)].append(a[i])
            B[kth(b[i],k)].append(b[i])

        return canget(A[0],B[1], candk, curKs, curKindex+1) & canget(A[1],B[0], candk, curKs, curKindex+1)
    else:
        numones = 0
        for i in range(len(a)):
            numones += kth(a[i],candk)
            numones += kth(b[i],candk)
        # print(numones)
        return (numones == n)




def f(a,b,K):
    n = len(a)
    A=[[],[]]
    B=[[],[]]

    for k in range(K-1,-1,-1):
        numones = 0
        for i in range(len(a)):
            numones += kth(a[i],k)
            numones += kth(b[i],k)
        if(numones == n):
            # print(f"k: {k}")
            for i in range(n):
                A[kth(a[i],k)].append(a[i])
                B[kth(b[i],k)].append(b[i])

            return (1<<k)+(f(A[0],B[1],k) & f(A[1],B[0],k))
    return 0
            # print("a0")
            # print(a0)
            # print("a1")
            # print(a1)
            # print("b0")
            # print(b0)
            # print("b1")
            # print(b1)

t = int(input())
for o in range(t):
    n = int(input())
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]

    # print(canget(a,b,1,[],0))
    curKlist = []
    for k in range(32,-1,-1):
        if(canget(a,b,k,curKlist,0)):
            curKlist.append(k)
    # print(curKlist)
    print(sum([2**x for x in curKlist]))


# for _ in range(100000):
#     n=3
#     size = 3
#     a = [random.randint(0,2**size) for i in range(n)]
#     b = [random.randint(0,2**size) for i in range(n)]
#
#     perms = [[0,1,2], [0,2,1], [1,0,2], [1,2,0], [2,0,1],[2,1,0]]
#     vals = []
#     for i in range(6):
#         vals.append((a[0]^b[perms[i][0]])&(a[1]^b[perms[i][1]])&(a[2]^b[perms[i][2]]))
#
#     if(f(a,b,31) != max(vals)):
#         print(a)
#         print(b)
#         print(f(a,b,31))
#         print(max(vals))
#         print("L")
