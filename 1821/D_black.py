#missed opportunity to call the problem "Paint it Black" (The Rolling Stones)

def process(n,k,l,r):
    # print("new process")
    #n = length of l,r
    #k = number of cells needed
    #We will take any range with length >=2, and ranges with length =1 depending

    min_moves = 10**10
    painted = 0
    num_singles = 0
    for i in range(n):
        if(l[i]==r[i]):
            num_singles +=1

        painted += r[i]-l[i] + 1

        if(painted >= k):
            moves = r[i] + 2*(i+1)
            #We now have a surplus of spots. We can remove num_singles for 2 each, or for 1 each any of the r-l+1 from the final series
            surplus = painted-k
            moves -= 2*min(num_singles,surplus)
            surplus -= min(num_singles,surplus)

            moves -= min(surplus, r[i]-l[i])

            # print(f"moves: {moves}")
            if(moves<min_moves):
                min_moves= moves
    if(min_moves == 10**10):
        print("-1")
    else:
        print(min_moves)

    # print(painted)

    


t = int(input())

for _ in range(t):
    n, k = [int(x) for x in input().split()]
    l = [int(x) for x in input().split()]
    r = [int(x) for x in input().split()]
    process(n,k,l,r)




