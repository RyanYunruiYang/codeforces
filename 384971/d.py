def search(n):
	l = 1
	r = n
	while(l<=r):
		m = (l+r)//2
		if(l==r):
			print(f"! {m}")
			return
		print(f"? {l} {m}")
		x = [int(e) for e in input().split()] # 4 2 5 1 3
		numfixed = 0
		for e in x:
			if(l<=e<=m):
				numfixed += 1
		if(numfixed % 2 ==1):
			r = m
		else:
			l = m+1

def main():
	t = int(input())
	for i in range(t):
		n = int(input())
		search(n)


if __name__ == "__main__":
	main()