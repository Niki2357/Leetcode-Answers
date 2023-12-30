from typing import List

class Solution:
    def solve(self, board: List[List[str]]) -> None:
        if not board:
            return
        rows, cols = len(board), len(board[0])

        def bfs(row, col):
            queue = [(row, col)]
            # mark the borders "N" (not capturable)
            board[row][col] = "N"
            while queue:
                row, col = queue.pop(0)
                indices = [(row - 1, col), (row + 1, col), (row, col - 1), (row, col + 1)]
                for row, col in indices:
                    if row in range(rows) and col in range(cols) and board[row][col] == "O":
                        queue.append((row, col))
                        board[row][col] = "N"

        # Start BFS from all border "O"s
        for row in range(rows):
            for col in range(cols):
                if (row == 0 or row == rows - 1 or col == 0 or col == cols - 1) and board[row][col] == "O":
                    bfs(row, col)

        # print(board)
        # Flip the capturable "O"s to "X"s and revert non-capturable "O"s back
        for row in range(rows):
            for col in range(cols):
                if board[row][col] == "O":
                    board[row][col] = "X"
                elif board[row][col] == "N":
                    board[row][col] = "O"

board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
board2 = [["O","O","O"],["O","O","O"],["O","O","O"]]
s = Solution()
s.solve(board)
print(board)
