import sys

def solve(start):
    if sum(arr) == s and len(arr) > 0:
        global cnt
        cnt += 1
    for i in range(start, n):
        arr.append(num[i])
        solve(i+1)
        arr.pop()

n, s = map(int, sys.stdin.readline().split())
num = list(map(int, sys.stdin.readline().split()))
arr=[]
cnt = 0

solve(0)
print(cnt)