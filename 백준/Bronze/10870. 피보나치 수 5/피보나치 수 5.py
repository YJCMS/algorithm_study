import sys
sys.setrecursionlimit(10**8)
    
n = int(sys.stdin.readline())
result = [0, 1]

for i in range(2, n+1):
    result.append(result[i-1] + result[i-2])
    
print(result[n])    