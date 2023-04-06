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


class neg:
	def __init__(self,val,pre):
		self.val = val
		self.pre = pre

def plausible(n):
	for i in range(len(part)):
		if (i>= n.pre):
			if (part[i]- n.val < 0):
				return False
	return True

def implement(n):
	global part
	for i in range(len(part)):
		if (i>= n.pre):
			part[i]-= n.val



n = inp()

# print('N')
# print(n)

# string_of_integer_input = input()

# print(string_of_integer_input)
# val = string_of_integer_input.split()
val = input().split()
for i in range(len(val)):
	val[i] = int(val[i])

# print(val)

num_pos = 0
part = [0]
running_total = 0

negs = []

zeroes = 0

for i in range(n):
	val[i] = int(val[i])
	if (val[i]>0):
		num_pos+=1
		running_total += val[i]
		part.append(running_total)
	if (val[i]==0):
		zeroes+=1
	if (val[i]<0):
		x = neg(-val[i],num_pos)
		negs.append(x)

newlist = sorted(negs, key=lambda x: x.val, reverse=False)


for n in newlist:
	if (plausible(n)):
		implement(n)
		zeroes+=1
print(num_pos+zeroes)

