def split(word):
    return [int(char) for char in word]

t = int(input())

for _ in range(t):
	score = 0
	n = int(input())

	s = input().split()
	for i in range(n):
		s[i] = int(s[i])
	# print(s)

	minimum = s[0]
	for e in s:
		if e<minimum:
			minimum = e
	# print(minimum)
	x =0
	for e in s:
		if e>minimum:
			x+=1
	print(x)



	# all_same = True

	# for i in range(2,n):
	# 	# print(minimum,num_min)
	# 	if (s[i]<minimum):
	# 		minimum=s[i]
	# 		num_min = 1
	# 		all_same = False
	# 	if (s[i]==minimum):
	# 		num_min+=1
	# 	if (s[i]>minimum):
	# 		all_same = False


	# if (all_same):
	# 	print(n)
	# else:
	# 	print(n-num_min)


