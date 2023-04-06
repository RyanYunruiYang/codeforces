import math
t = int(input())

for o in range(t):
    n = int(input())

    if(n==1):
        print(2)
    else:
        print(math.ceil(n/3))
