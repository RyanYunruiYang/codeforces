import sys
input = sys.stdin.readline

############ ---- Input Functions ---- ############
def inp():
    return(int(input()))
def inlt():
    return(list(map(int,input().split())))
def insr():
    s = input()
    return(list(s[:len(s) - 1]))
def invr():
    return(map(int,input().split()))
def split(word):
    return [char for char in word]



def log(x,y):
    x = int(x)
    for i in range(x):
        print(y,end='')
    print()

t = inp()
for _ in range(t):
    s = input()
    s = s.split()
    # print(s)
    n = int(s[0])
    m = int(s[1])
    s = input()
    cells = split(s)
    cells.pop()

    lengths = []
    current = 0
    num_repeat = 0

    for i in range(n):
        cells[i] = int(cells[i])
        if(cells[i] == current):
            num_repeat+=1
        else:
            lengths.append(num_repeat)
            num_repeat= 1
            current = cells[i]

    lengths.append(num_repeat)
    # print(cells)
    # print("lengths: ")
    # print(lengths)
    tup = len(lengths)

    if (tup>1):
        # print('entered')
        for e in range(tup):
            val = e % 2
            num = lengths[e]

            if (val==0):
                if (e==0):
                    mini = min(num,m)
                    lengths[e]-=mini
                    lengths[e+1]+=mini
                if (e==tup-1):
                    mini = min(num,m)
                    lengths[e]-=mini
                    lengths[e-1]+=mini
                if (e>0 and e<tup-1):
                    mini = min(num//2,m)
                    lengths[e]-= 2*mini
                    lengths[e-1]+=mini
                    lengths[e+1]+=mini
    for e in range(tup):
        for i in range(lengths[e]):
            print(e%2,end='')
    print()


        # if (val == 0):
        #     if (2*m <= num):
        #         log(m,1)
        #         log(num-2*m,0)
        #         log(m,1)
        #     else: #if (2*m > num):
        #         if(num % 2 ==0):
        #             log(num,1)
        #         else:
        #             log((num-1)/2,1)
        #             log(1,0)
        #             log((num-1)/2,1)
        # else:
        #     log(num,1)



