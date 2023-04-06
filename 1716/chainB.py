t = int(input())


for o in range(t):
    n = int(input())
    print(n)
    for i in range(n):
        # print(f"i: {i}")
        for j in range(2,i+2):
            print(j, end= ' ')
        print(1, end=' ')
        for j in range(i+2,n+1):
            print(j, end=' ')
        print()

    #
    #
    # 1 2 3 4 5
    # 2 1 3 4 5
    # 2 3 1 4 5
    # 2 3 4 1 5
    # 2 3 4 5 1
