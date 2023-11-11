from typing import List

class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        m = len(board)
        n = len(board[0])
        directions = [[-1, -1], [-1, 0], [-1, 1], [0, -1], [0, 1], [1, -1], [1, 0], [1, 1]]
        tempBoard = [[board[i][j] for j in range(n)] for i in range(m)]
        
        for i in range(m):
            for j in range(n):
                live_neighbors = 0
                # Count the live neighbors
                for entry in directions:
                    row = i + entry[0]
                    col = j + entry[1]
                    if (row >= 0 and row < m and col >= 0 and col < n and tempBoard[row][col] == 1):
                        live_neighbors += 1

                if tempBoard[i][j] == 1:
                    if live_neighbors < 2 or live_neighbors > 3:
                        board[i][j] = 0
                else:
                    if live_neighbors == 3:
                        board[i][j] = 1 

s = Solution()
board = [[0, 1, 0], [0, 0, 1], [1, 1, 1], [0, 0, 0]]
s.gameOfLife(board)
print(board)