def split(word):
    return [int(char) for char in word]

t = int(input())

for _ in range(t):
	score = 0
	n = int(input())

	s = split(input())

	x = 0
	y = 0
	
	mid = 1
	if ((n%2)==1):
		mid = s[int((n-1)/2)]

	for i in range(n//2):
		m = s[i]+s[n-1-i]
		if (m==0):
			y+=1
		if (m==1):
			x+=1
	score = -x #A - B

	if (mid==0):
		score += 1-2*(y%2)
	else:
		score += 2*(y%2)
	
		
	if (score<0):
		print("ALICE")
	if (score==0):
		print("DRAW")
	if (score>0):
		print("BOB")

