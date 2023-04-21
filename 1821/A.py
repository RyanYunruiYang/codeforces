def process(s):
    total = 1

    if(s[0] == "0"):
        return 0
    
    if(s[0] == "?"):
        total = 9

    # print(f"total: {total}")
    for i in range(1,len(s)):
        # print(f"i: {s[i]}")
        if(s[i] == "?"):
            total *= 10
    return total


t = int(input())

for _ in range(t):
    s = input()
    print(process(s))


