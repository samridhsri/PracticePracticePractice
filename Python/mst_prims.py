import heapq

edges = [('A', 'B', 10), ('A', 'C', 3), ('C', 'B', 4), ('B', 'D', 1), ('C', 'D', 4), ('C', 'E', 4), ('D', 'E', 2)]
nodes = ['A', 'B', 'C', 'D', 'E']

def primsMST(edges, nodes, src='A'):
    
    # Create the adjacency list
    adjList = {}
    
    for node in nodes:
        adjList[node] = []
    
    for s,d,w in edges:
        adjList[s].append((d,w))
        adjList[d].append((s,w))
    
    MST = []
    visited = set()
    
    minHeap = [(0, src, src)]  # (weight, source, destination)
    
    while minHeap:
        w1, s, dest = heapq.heappop(minHeap)
        
        if dest in visited:
            continue
        
        visited.add(dest)
        MST.append((s, dest))
        
        # Check all of its neighbors
        
        for n2, w2 in adjList[dest]:
            if n2 not in visited:
                heapq.heappush(minHeap, (w2, dest, n2))
    
    return MST

print(primsMST(edges, nodes, 'B'))