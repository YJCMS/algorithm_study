import sys 
sys.setrecursionlimit(10**8)

input = sys.stdin.readline

t = int(input().strip())

for _ in range(t):
    n = int(input().strip())
    cnt_0 = 1 
    cnt_1 = 0 
    for _ in range(n):
        cnt_0, cnt_1 = cnt_1, cnt_0 + cnt_1

    print(cnt_0, cnt_1)