t = int(input())

for _ in range(t):
    s = input().split()
    n = int(s[0])
    s1 = int(s[1])
    s2 = int(s[2])
    # print(f"s1: {s1}, s2: {s2}")
    r_vals = []

    r = input().split()
    for i in range(n):
        r_vals.append([i+1,int(r[i])])
    
    # print(r_vals)

    r_vals.sort(key=lambda x: -x[1])

    # print(r_vals)

    a_cost = s1
    b_cost = s2
    a = []
    b = []
    for i in range(n):
        if(a_cost<b_cost):
            a.append(r_vals[i][0])
            a_cost += s1
        else:
            b.append(r_vals[i][0])
            b_cost += s2
    print(len(a), end= ' ')
    for i in range(len(a)):
        print(a[i], end= ' ')
    print()

    print(len(b), end= ' ')
    for i in range(len(b)):
        print(b[i], end = ' ')
    print()

    # print(a)
    # print(b)