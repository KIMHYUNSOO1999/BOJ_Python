import sys

N = int(sys.stdin.readline())
number_list = [0] * 10001

for _ in range(N):
    number_list[int(sys.stdin.readline())] += 1

for i in range(10001):
    if number_list[i] != 0:
        for j in range(number_list[i]):
            print(i)