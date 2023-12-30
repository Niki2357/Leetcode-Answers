import collections
from typing import Collection, List
class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        ### the following does not work because in a regular dictionary, b cannot -> [a, 1/2] and [c, 3] at the same time.
        # adj = {}
        # for i in range(numEquations):
        #     firstElement = equations[i][0]
        #     secondElement = equations[i][1]
        #     adj[firstElement] = (secondElement, values[i])
        #     adj[secondElement] = (firstElement, 1/values[i])
        
        ### solution is to use collections.defaultdict(list) and *append*
        adj = collections.defaultdict(list)
        for i,eq in enumerate(equations):
            firstElement, secondElement = eq
            adj[firstElement].append([secondElement, values[i]])
            adj[secondElement].append([firstElement, 1/values[i]])
        print(adj)

        def bfs(src, target):
            if src not in adj or target not in adj:
                return -1
            # queue[i][0] is the source
            # queue[i][1] is the product so far, so it starts with 1
            queue = [[src,1]]
            visited = [src]
            while queue:
                thisSrc, thisProduct = queue.pop(0)
                # print(src , thisSrc)
                if thisSrc == target:
                    return thisProduct
                # here, adj[thisSrc] is a list of paired [neighbor, value]
                # for example, if b -> [a, 1/2] and [c, 3], adj[b] = [[a, 1/2], [c, 3]]
                for neighbor, value in adj[thisSrc]:
                    if neighbor not in visited:
                        queue.append([neighbor, thisProduct * value])
                        visited.append(neighbor)
            return -1
        return [bfs(query[0],query[1]) for query in queries]
    
s = Solution()
equations = [["a","b"],["b","c"]]
values = [2.0,3.0]
queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
print(s.calcEquation(equations, values, queries))