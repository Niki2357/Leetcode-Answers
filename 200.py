from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        rows, cols = len(grid), len(grid[0])
        visit = []
        islands = 0

        def bfs(r,c):
            queue = [(r,c)]
            visit.append((r,c))
            while len(queue) > 0:
                row, col = queue.pop(0)
                indices = [(row + 1, col), (row - 1, col), (row, col + 1), (row, col - 1)]
                for row, col in indices:
                    if (row in range(rows) and col in range(cols) and
                    grid[row][col] == "1" and
                    (row,col) not in visit):
                            queue.append((row,col))
                            visit.append((row,col))

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == "1" and (r,c) not in visit:
                    bfs(r,c)
                    islands += 1
        return islands
    
grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]

s = Solution()
print(s.numIslands(grid))