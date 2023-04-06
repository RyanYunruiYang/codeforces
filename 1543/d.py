t= int(input())

for i in range(t):
	x = input().split()

	n = int(x[0])
	k = int(x[1])

	nots = [0]
	mex = 0

	print(0)
	r = int(input())


	while (r!= 1):
		temp = [0]
		for elem in nots:
			temp.append((elem|mex))
		
		nots = temp
		k = 0

		# print(temp)
		while(k in nots):
			k+=1
		mex = k

			
		print(k)

		r = int(input())
