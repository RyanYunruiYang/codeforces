
# A Python program to print all
# permutations using library function
from itertools import permutations
import math
 
# Get all permutations of [1, 2, 3]

for n in range(3,4):
    listo = permutations([i for i in range(n)])
    count = 0
    sm = 0
    # Print the obtained permutations
    for perm in list(listo):
        print(perm)
        
        for k in range(n):
            for q in range(k):
                x = perm[k]-perm[q]
                if (x==1):
                    break
                if (x==-1):
                    break
        k+=1
       
        # while((x!=1) and (x != -1) and (k+1<n)):
        #     k+=1

        #     x = perm[k]-perm[(k+1 % n-1)]


        count+=1
        sm+=k
        print(k)
    print(sm/count)