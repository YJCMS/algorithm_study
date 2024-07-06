#반복문으로 푸는경우
import sys
n = int(sys.stdin.readline())
result = n
if n > 0:
    for i in range(n-1, 0, -1):
        result *= i
else : result = 1
print(result)   