N = int(input()) 
compare = [] 

for _ in range(N): 
    x, y = map(int, input().split())
    compare.append((x,y))

for i in compare:
    rank = 1 
    for j in compare:
        if i[0] < j[0] and i[1] < j[1]: 
            rank+=1 
    print(rank, end = " ") 