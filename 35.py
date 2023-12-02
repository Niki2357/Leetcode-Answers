from typing import List

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        if target > nums[-1]:
            return len(nums)
        while left <= right:
            mid = (int) ((left + right) / 2)
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                right = mid - 1
            elif nums[mid] < target:
                left = mid + 1
        return left

# class Solution:
#     def searchInsert(self, nums: List[int], target: int) -> int:
#         length = len(nums)
#         index = (int) (length/2)
#         n = 5
#         while True:
#             print(index)
#             if nums[index] == target:
#                 return index
#             elif nums[index] > target:
#                 if index == 0:
#                     return 0
#                 if nums[index - 1] < target:
#                     return index
#                 index = (int) (index/2)
#                 # print(index)
#             elif nums[index] < target:
#                 if index == length - 1 or nums[index + 1] > target:
#                     return index + 1
#                 index = index + max(1,(int) (index/2))
#                 # print(index)
#             n -= 1
        

s = Solution()
nums = [1,3,5,6]
print(s.searchInsert(nums, 7))
