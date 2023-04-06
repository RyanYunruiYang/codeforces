import math

n,k = [int(x) for x in input().split()]

numways = [0 for i in range(n+1)]
numways[0] = 1
total = [0 for i in range(n+1)]
# for step in range(k,int(math.sqrt(2*n)+5)):
#     print(step)


step = k

while(step*(step+1) -k*(k+1) < 2*n):
    # print(step)
    newnumways = [0 for i in range(n+1)]

    for i in range(n+1):
        adder = i+step
        while(adder<=n):
            newnumways[adder] += numways[i]
            adder += step

        total[i] += newnumways[i]

    numways = newnumways
    step +=1


for i in range(1,n+1):
    print(total[i], end=' ')
print()
