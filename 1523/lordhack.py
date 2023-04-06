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
    n = inp()
    trash = input()

    print(3*n)             

    for x in range(n//2):
        j = str(2*x+1)
        i = str(2*x+2)
        print("1 "+j + " " + i) 
        print("2 "+j + " " + i) 
        print("1 "+j + " " + i) 
        print("1 "+j + " " + i) 
        print("2 "+j + " " + i) 
        print("1 "+j + " " + i) 



# val = [4,3,1,2]

# for i in range(16):
#     x = input().split()

#     for i in range(3):
#         x[i]=int(x[i])
#     print(x)
#     if (x[0]==1):
#         val[x[1]-1]+=val[x[2]-1]
#     if (x[0]==2):
#         val[x[2]-1]-=val[x[1]-1]
#     print(val)











         
# 1 1 4
# 2 1 4
# 1 1 4
# 1 1 4
# 2 1 4
# 1 1 3
# 2 1 3
# 1 1 3
# 1 1 3
# 2 1 3
# 1 1 2
# 2 1 2
# 1 1 2
# 1 1 2
# 2 1 2
# 1 1 2