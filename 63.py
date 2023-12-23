from typing import List

class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        dp = [[0 for i in range(n)] for j in range(m)]
        fill = 1 
        for i in range(n): 
            if obstacleGrid[0][i] == 0:
                dp[0][i] = fill
            else:
                fill = 0
                dp[0][i] = fill
        fill = 1
        for i in range(m): 
            if obstacleGrid[i][0] == 0:
                dp[i][0] = fill
            else:
                fill = 0
                dp[i][0] = fill
        for i in range(1,m):
            for j in range(1,n):
                if obstacleGrid[i][j] == 1:
                    dp[i][j] = 0
                else:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]

        return dp[m-1][n-1]
s = Solution()
obstacleGrid = [[0,1],[0,0]]
print(s.uniquePathsWithObstacles(obstacleGrid))