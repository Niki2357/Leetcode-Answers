from typing import List

class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        rowTop = 0
        rowBot = m - 1
        # find the correct row (rowMid)
        while rowTop <= rowBot:
            rowMid = (int)((rowTop + rowBot) / 2)
            if matrix[rowMid][0] > target:
                rowBot = rowMid - 1
            elif matrix[rowMid][-1] < target:
                rowTop = rowMid + 1
            else:
                break

        print("row", rowMid)
        left = 0
        right = n - 1
        while left <= right:
            print(left, right)
            mid = (int)((left + right) / 2)
            if matrix[rowMid][mid] == target:
                return True
            if matrix[rowMid][mid] < target:
                left = mid + 1
            elif matrix[rowMid][mid] > target:
                right = mid - 1
        return False

s = Solution()
matrix = [[1]]
print(s.searchMatrix(matrix, 0))


