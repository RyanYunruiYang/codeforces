t = int(input())

for i in range(t):
	n = int(input())

	s=  input()
	val = s.split()

	for i in range(2*n):
		val[i] = int(val[i])

	val.sort()
	for i in range(n):
		print(val[i],end=' ')
		print(val[2*n-1-i],end= ' ')
	print()
