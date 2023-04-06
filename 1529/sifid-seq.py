import math as m
t = int(input())

for _ in range(t):
	score = 0
	n = int(input())

	s = input().split()
	for i in range(n):
		s[i] = int(s[i])

	s.sort()
	# print(s)

	if(n==1):
		print(1)
	else:
		min_dif = m.fabs(s[0]-s[1]) 
		k = 1
		for i in range(1,n):
			dif = m.fabs(s[i]-s[i-1])

			if dif<min_dif:
				min_dif = dif
			if min_dif>=s[i]:
				k=i+1
		print(k)
