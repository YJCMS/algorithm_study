import sys
import heapq 

def dijkstra(graph, start):
    distances = {vertex: float('inf') for vertex in graph}
    distances[start] = 0
    pq = [(0, start)]
    
    while pq:
        current_distance, current_vertex = heapq.heappop(pq)
        
        if current_distance > distances[current_vertex]:
            continue
        
        for neighbor, weight in graph[current_vertex].items():
            distance = current_distance + weight
            
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(pq, (distance, neighbor))
    
    return distances

n, m, k, x = map(int, sys.stdin.readline().split())
graph = {i: {} for i in range(1, n+1)}

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = 1 # 가중치(거리) = 1

distances = dijkstra(graph, x)
result = []

for node, distance in distances.items():
    if distance == k :
        result.append(node)

if result:
    for city in result:
        print(city)
else:
    print(-1)
