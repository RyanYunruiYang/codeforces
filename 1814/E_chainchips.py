def main():
    n = int(input())

    a = [int(x) for x in input().split()]
    q = int(input())

    for _ in range(q):
        s = input().split()
        a[int(s[0])-1] = int(s[1])
        solve(a)

def solve(a):
    # print(a)
    n = len(a)
    dp = [0 for i in range(n)]
    dp[0] = a[0]
    dp[1] = a[0] + a[1]
    dp[2] = a[0] + a[2]
    for i in range(3, n):
        dp[i] = min(dp[i-3]+a[i-1]+a[i], dp[i-2]+a[i])
    # print(dp)

    print(2*dp[-1])

if __name__ == "__main__":
    main()