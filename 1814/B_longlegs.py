import math

t = int(input())

for _ in range(t):
    s = input().split()
    x = int(s[0])
    y = int(s[1])

    min_moves = x+y

    min_m = max(math.floor(math.sqrt(x+y))-10000,1)
    max_m = min(max(x,y)+1, math.floor(math.sqrt(x+y))+10000)
    for m in range(min_m, max_m):
        cand = (m-1) + math.ceil(x/m) + math.ceil(y/m)
        # print(f"m: {m}, cand: {cand}")
        if(cand<min_moves):
            min_moves = cand
        
    print(min_moves)