def getSum(n):
 
    sum = 0
    while (n != 0):
 
        sum = sum + int(n % 10)
        n = int(n/10)
 
    return sum


t = int(input())

for _ in range(t):
	x = int(input())#By chicekn mcnugget theorem, if x>111*11-111-11, we can always do it with 11,111
	#thus, we will only ever need 11,111


	r = x % 11
	x = x - 111*r

	if(x>= 0):
		print("YES")
	else:
		print("NO")