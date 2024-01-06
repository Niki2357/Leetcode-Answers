from typing import List
class Solution:
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        if len(triangle) == 1:
            return triangle[0][0]
        newTriangle = [[triangle[0][0]]]
        newTriangle.append([triangle[1][0] + triangle[0][0], triangle[1][1] + triangle[0][0]])
        for i in range(2, len(triangle)):
            temp = []
            for j in range(len(triangle[i])):
                if j == 0:
                    temp.append(triangle[i][j] + newTriangle[i-1][j])
                elif j == len(triangle[i]) - 1:
                    temp.append(triangle[i][j] + newTriangle[i-1][j-1])
                else:
                    temp.append(triangle[i][j] + min(newTriangle[i-1][j-1],newTriangle[i-1][j]))
            newTriangle.append(temp)

        print(newTriangle)
        return min(newTriangle[-1])

s = Solution()
triangle = [[10]]
print(s.minimumTotal(triangle))
