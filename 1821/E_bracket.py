def process(k, s):
    # print("new process")
    l = []
    r = []
    for i in range(len(s)):
        if(s[i] == "("):
            l.append(i)
        else:
            r.append(i)
    # print(l)
    # print(r)

    gaps = [(i, r[i]-l[i]) for i in range(len(s)//2)]
    # print(gaps)
    gaps.sort(key=lambda x: -x[1])
    # print(gaps)

    blacklist = []
    for i in range(min(k,len(gaps))):
        # print(f"gaps[i][0]: {gaps[i][0]}")
        blacklist.append(l[gaps[i][0]])
        blacklist.append(r[gaps[i][0]])
    # print(blacklist)
    running_total = 0
    cost = 0
    for i in range(len(s)):
        if(i not in blacklist):
            if(s[i] == "("):
                running_total += 1
            else:
                running_total -= 1
                cost += running_total
    # print(f"cost: {cost}")
    print(cost)
    



t = int(input())

for _ in range(t):
    k = int(input())
    s = input()
    process(k, s)