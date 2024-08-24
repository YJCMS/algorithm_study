import sys

input = sys.stdin.readline
n, m = map(int, input().split())
a, b = [], []

for i in range(n):
    a.append(list(map(int, input().split())))

for i in range(n):
    b.append(list(map(int, input().split())))

result = []
for i in range(n):
    row = []
    for j in range(m):
        row.append(a[i][j]+b[i][j])
    result.append(row)
        
for row in result:
    print(" ".join(map(str, row)))

