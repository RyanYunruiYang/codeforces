

# https://codeforces.com/contest/688/problem/B
def split(word):
    return [char for char in word]

def listToString(s): 
    
    # initialize an empty string
    str1 = "" 
    
    # traverse in the string  
    for ele in s: 
        str1 += ele  
    
    # return string  
    return str1 

x = input()
print(x,end='')

s = split(x)
n = len(s)

# for i in range(n):
# 	s[i] = int(s[i])

for i in range(n):
	print(s[n-1-i],end='')

