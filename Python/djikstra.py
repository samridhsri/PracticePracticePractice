import heapq

# Edge representation: (source, destination, weight)
edges = [('A', 'B', 10), ('A', 'C', 3), ('C', 'B', 4), ('B', 'D', 2), ('C', 'D', 8), ('C', 'E', 2), ('D', 'E', 5)]
nodes = ['A', 'B', 'C', 'D', 'E']

# def shortestPath(edges, nodes, src):
#     """ edges is the list, n is the number of nodes, src is the source """
    
#     # First we need to create an adj matrix
#     adj = {}
#     for node in nodes:
#         adj[node] = []
    
#     # Fill the adjacency matrix
#     for s, d, w in edges:
#         adj[s].append((d, w))
    
#     # Create a hashmap to store shortest distance
#     shortest = {}
#     minHeap = [(0, src)]
    
#     while minHeap:
#         w1, n1 = heapq.heappop(minHeap)
#         if n1 in shortest:
#             continue
#         shortest[n1] = w1
        
#         # Check all of its neighbors
#         for n2, w2 in adj[n1]:
#             if n2 not in shortest:
#                 heapq.heappush(minHeap, (w1 + w2, n2))
    
#     return shortest


def shortestPath(edges, nodes, src):
    
    # create adjacency list using dictionary since nodes are name based
    adjList = {}
    
    for node in nodes:
        adjList[node] = []
        
    for s,d,w in edges:
        adjList[s].append((d,w))
    
    # create shortest to return in the end
    
    shortest = {}
    minHeap = [(0, src)]
    
    while minHeap:
        w1, n1 = heapq.heappop(minHeap)
        
        if n1 in shortest:
            continue
        
        shortest[n1] = w1
        
        # Check the neighbours
        
        for n2, w2 in adjList[n1]:
            if n2 not in shortest:
                heapq.heappush(minHeap, (w1+w2, n2))
    
    return shortest

print(shortestPath(edges,nodes, 'A'))
