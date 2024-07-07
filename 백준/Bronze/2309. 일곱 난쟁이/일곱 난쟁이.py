import sys

num_list = []
for i in range(9):
    num_list.append(int(sys.stdin.readline()))
    
num_list.sort()
sum = sum(num_list)

for i in range(len(num_list)):
    for j in range(i+1, len(num_list)):
        if sum - num_list[i] - num_list[j] == 100 :
            for k in range(len(num_list)):
                if k == i or k == j:
                    pass
                else: 
                    print(num_list[k])
            exit()