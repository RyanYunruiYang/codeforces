t = int(input())
for o in range(t):
    n, m, sx, sy, d = [int(x) for x in input().split()]

    if((n-sx)>d and sy-1>d):
        print(n+m-2)
    elif(sx-1>d and m-sy>d):
        print(n+m-2)
    else:
        print(-1)
