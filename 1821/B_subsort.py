def process(n,a,b):
    # print(n)
    # print(a)
    # print(b)

    found_one = False
    l = -1
    r = -1
    for i in range(n):
        if(a[i] != b[i]):
            r = i

            if(not found_one):
               l = i
            found_one = True
    
    fruitful = True
    while(fruitful):
        fruitful = False
        if(b[l-1] <= b[l] and l-1>=0):
            l = l-1
            fruitful = True

    fruitful = True
    while(fruitful):
        fruitful = False
        if(r+1<n and b[r+1] >= b[r]):
            r = r+1
            fruitful = True

    # print(f"l: {l}, r: {r}")
    print(f"{l+1} {r+1}")

t = int(input())

for _ in range(t):
    n = int(input())
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]

    process(n,a,b)
