def solve(a, n):
	if(a[0]+a[1]+a[2]<a[0]):
		return False
	if(a[n-3]+a[n-2]+a[n-1]>a[n-1]):
		return False


	b = []
	numzeroes = 0
	for i in range(n):
		if(numzeroes<=3 or a[i]>0):
			b.append(a[i])
			if(a[i] == 0):
				numzeroes += 1

	# print(b)

	for i in range(len(b)):
		for j in range(i+1,len(b)):
			for k in range(j+1,len(b)):
				if(b[i]+b[j]+b[k] not in b):
					return False

	return True


t = int(input())

for o in range(t):
	n = int(input())
	s = input()
	a = [int(i) for i in s.split()]

	a.sort()

	if(solve(a, n)):
		print("YES")
	else:
		print("NO")

