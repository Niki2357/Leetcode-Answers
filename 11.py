from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        max = 0
        while (left < right):
            if (right-left) * min(height[right],height[left]) > max:
                max = (right-left) * min(height[right],height[left])
            if height[right] < height[left]:
                right -= 1
            else:
                left += 1
        return max
    
# HORRIBLE METHOD
# class Solution:
#     def maxArea(self, height: List[int]) -> int:
#         maxHeight = 0
#         for heights in height:
#             if heights > maxHeight:
#                 maxHeight = heights
#         print('hiii', maxHeight)
#         max = 0
#         for i in range(len(height)):
#             for j in range(i+1,len(height)):
#                 # if max/(j-i) > maxHeight:
#                 #     break
#                 print(min(height[i],height[j]) * (j-i))
#                 if min(height[i],height[j]) * (j-i) > max:
#                     max = min(height[i],height[j]) * (j-i)
#         return max

s = Solution()
height = [1,3,2,5,25,24,5]
print(s.maxArea(height))