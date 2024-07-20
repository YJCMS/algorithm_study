import sys

n, k = map(int, sys.stdin.readline().split())
coin = list(int(sys.stdin.readline()) for _ in range(n))
count = 0

for i in range(n-1, -1, -1):
    if k == 0:
        break
    count += k//coin[i]
    k = k % coin[i]
    
print(count)