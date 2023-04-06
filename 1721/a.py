t = int(input())
for o in range(t):
    occ = [0 for i in range(26)]
    first = input()
    second = input()
    occ[ord(first[0])-ord('a')] += 1
    occ[ord(first[1])-ord('a')] += 1
    occ[ord(second[0])-ord('a')] += 1
    occ[ord(second[1])-ord('a')] += 1

    nonzero = []
    for i in range(26):
        if (occ[i]>0):
            nonzero.append(occ[i])
    nonzero.sort()
    print(len(nonzero) - 1)

    # if(len(nonzero) == 1):
    #     print(0)
    # if(len(nonzero) == 2):
    #     print(1)
    # if(len(nonzero) == 3):
    #     return 2
    # if(len(nonzero) == 4):
    #     return 3
