from typing import List


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        sol = []
        total = len(matrix) * len(matrix[0])
        done = 0
        p = 0
        q = 0
        m = len(matrix) - 1
        # print(m)
        n = len(matrix[0]) - 1
        # print(n)
        # print(half)
        row = 0
        col = 0
        while p <= m and q <= n:
            if row == p:
                while col <= n:
                    sol.append(matrix[row][col])
                    done += 1
                    col += 1
                p += 1
                col -= 1
                row += 1
            if done == total:
                break
            if col == n:
                while row <= m :
                    sol.append(matrix[row][col])
                    done += 1
                    row += 1
                n -= 1
                row -= 1
                col -= 1
            if done == total:
                break
            if row == m:
                while col >= q:
                    print('column is', col, q)
                    sol.append(matrix[row][col])
                    done += 1
                    col -= 1
                m -= 1
                col += 1
                row -= 1
            if done == total:
                break
            if col == q:
                while row >= p:
                    sol.append(matrix[row][col])
                    done += 1
                    row -= 1
                q += 1
                row += 1
                col += 1
            
            
        print(sol)
        return sol

s = Solution()
matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
s.spiralOrder(matrix)

