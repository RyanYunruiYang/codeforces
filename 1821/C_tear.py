def process(x):
    # print(x)
    min_max = len(x) - 1

    for i in range(26):
        max = -1
        cur_run = 0
        for j in range(len(x)):
            if(x[j] == i):
                if(cur_run >= max):
                    max = cur_run
                cur_run = 0
            else:
                cur_run += 1
        if(cur_run>=max):
            max = cur_run
        # print(f"{i}: {max}")
        if(max<min_max):
            min_max = max
    # print(min_max)
    print(valueOf(min_max))

def valueOf(n):
    if(n==0):
        return 0
    if(n==1):
        return 1
    if(n==2):
        return 2
    
    if(n%2==0):
        return 1+valueOf(n/2)
    else:
        return 1+valueOf((n-1)/2)

t = int(input())

for _ in range(t):
    s = input()
    x = [ord(s[i])-97 for i in range(len(s))]
    process(x)

# for i in range(20):
#     print(f"{i}: {valueOf(i)}")