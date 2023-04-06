# d = [[0 for x in range(100)] for y in range(100)] 
# for i in range(100):
#     for j in range(int())

# for x in range(100):
#     for d in range(100):
#         if(d[x][i]==1):
#             print(i)

for i in range(100):
    s = ""
    j=i+1
    x = (j%3==0)
    y = (j%5==0)
    if(x):
        s = s+"Fizz"
    if(y):
        s = s+"Buzz"
    if(not x and not y):
        s = j
    print(s)