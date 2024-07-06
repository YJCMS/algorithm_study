#재귀함수로 푸는경우
import sys
def factorial(n):
    if n == 0 : return 1
    return n * factorial(n-1)
a = int(sys.stdin.readline())
print(factorial(a))