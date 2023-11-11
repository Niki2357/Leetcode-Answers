from typing import List

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        # Find zeros:
        rows = []
        cols = []
        m = len(matrix)
        n = len(matrix[0])
        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    if i not in rows:
                        rows.append(i)
                    if j not in cols:
                        cols.append(j)
        print(rows)
        print(cols)
        # Set zeros:
        for i in range(m):
            for j in range(n):
                if i in rows or j in cols:
                    matrix[i][j] = 0
        print(matrix)
        


            

s = Solution()
matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
s.setZeroes(matrix)