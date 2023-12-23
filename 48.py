from typing import List

# Attempt 1
# class Solution:
#     def rotate(self, matrix: List[List[int]]) -> None:
#         # print(matrix)
#         n = len(matrix[0])
#         # transpose
#         for i in range(n):
#             for j in range(i,n):
#                 temp = matrix[j][i]
#                 matrix[j][i] = matrix[i][j]
#                 matrix[i][j] = temp
#         # print(matrix)
#         #switch cols
#         for i in range(n):
#             for j in range(int((n+1)/2)):
#                 temp = matrix[i][j]
#                 matrix[i][j] = matrix[i][n - 1 - j]
#                 matrix[i][n - 1 - j] = temp
#         # print(matrix)

# Attempt 2 uhhh can't solve
class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        length = len(matrix[0]) - 1
        temp = matrix[0][0]
        for row in range(length + 1):
            for col in range(length + 1):
                if row == 0 and col == length:
                    matrix[row][col] = temp
                else:
                    matrix[row][col] = matrix[length - col][row]
        print(matrix)


s = Solution()
matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
s.rotate(matrix)