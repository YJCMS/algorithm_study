import sys

n = int(sys.stdin.readline())
result = n;
if n == 0:
    result = 1
else :
    for i in range(n-1, 0, -1):
        result *= i
    
print(result)
    