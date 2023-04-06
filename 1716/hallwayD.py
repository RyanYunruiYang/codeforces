def minwait(top, bottom): #return maximum wait time
    n = len(top)

    if(n==1):
        return max(top[0]+1, bottom[0])

    maxblock =0
    for i in range(n):
        if(top[i]+2*n-1-i >maxblock):
            maxblock = top[i]+2*n-1-i
        if(bottom[i] + i > maxblock):
            maxblock = bottom[i]+i;

    return min(maxblock, minwait(bottom[1:], top[1:]))

t = int(input())
for o in range(t):
    m = int(input())

    top = [int(x) for x in input().split()]
    bottom = [int(x) for x in input().split()]

    print(top)
    print(bottom)

    print(minwait(top,bottom))
