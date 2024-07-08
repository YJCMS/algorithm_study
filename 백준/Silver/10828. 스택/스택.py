import sys
n = int(sys.stdin.readline())

stack = []
for i in range(n):
    rl = sys.stdin.readline().split()

    if rl[0] == 'push' :
        stack.append(rl[1])
    elif rl[0] == 'pop' :
        if len(stack) == 0: print(-1)
        else: print(stack.pop())
    elif rl[0] == 'size' :
        print(len(stack))
    elif rl[0] == 'empty' :
        if len(stack) == 0: print(1)
        else : print(0)
    elif rl[0] == 'top' :
        if len(stack) == 0: print(-1)
        else: print(stack[-1])