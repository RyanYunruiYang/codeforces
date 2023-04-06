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

def execute(arr):
    print(arr[0],end='')
    for i in range(1,len(arr)):
        print("."+str(arr[i]),end='')
    print()

t = inp()

for _ in range(t):
    n = inp()

    current = []
    for i in range(n):
        x = inp()

        if (x==1):
            current.append(1)
        else:#assert x>1
            i = len(current)-1
            notfound = True

            while(notfound):
                if (current[i]==x-1):
                    current[i]+=1
                    current = current[:i+1]
                    notfound= False
                i-=1
            # print(i)



        execute(current)






