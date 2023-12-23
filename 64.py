from typing import List

# Binary Tree approach, too slow
# class Solution:
#     def findMin(self, grid: List[List[int]], row: int, col: int) -> int:
#         m = len(grid)
#         n = len(grid[0])
#         if row == m - 1 and col == n - 1:
#             return grid[row][col]
#         elif row == m - 1:
#             return grid[row][col] + s.findMin(grid, row, col + 1)
#         elif col == n - 1:
#             return grid[row][col] + s.findMin(grid, row + 1, col)
#         return grid[row][col] + min(s.findMin(grid, row + 1, col), s.findMin(grid, row, col + 1))

#     def minPathSum(self, grid: List[List[int]]) -> int:
#         return s.findMin(grid, 0,0)

# DP approach:
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        dp = [[0 for i in range(n)] for j in range(m)]
        dp[0][0] = grid[0][0]
        print(dp)
        # fill out the first row
        for i in range(1,n):
            dp[0][i] = dp[0][i-1] + grid[0][i]
        # fill out the first col
        for i in range(1,m):
            dp[i][0] = dp[i-1][0] + grid[i][0]
        # fill out the rest
        for i in range(1,m):
            for j in range(1,n):
                print(i,j)
                dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + grid[i][j]

        # print(dp)
        return dp[m-1][n-1]

s = Solution()
grid = [[1,2,3],[4,5,6]]
print(s.minPathSum(grid))