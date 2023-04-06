t = int(input())

for o in range(t):
	s1 = input().split()
	n = int(s1[0])
	k = int(s1[1])

	s = input().split()
	x = [int(i) for i in s]
	# print(x)

	if(k>=2):
		counter = 0
		for i in range(1,n-1):
			# print(x[i], end=' ')
			if(x[i]> x[i-1] + x[i+1]):
				counter +=1
		print(counter)
	else: 
		print((n-1)//2)

		#n=3: 1
		#n=4: 1
		#n=5: 2
