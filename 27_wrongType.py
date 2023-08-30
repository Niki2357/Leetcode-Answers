import numpy as np
nums = [3,2,2,3]
val = 3
# class Solution(object):
#     def removeElement(self, nums, val):
#         length = len(nums)
#         k = len(nums)
#         for i in range(length):
#             if nums[i] == val:
#                 k -= 1
#                 nums[i] = -1
#         nums.sort(reverse=True)
#         nums = nums[0:k]
#         return(nums)
        

import numpy as np
class Solution(object):
    def removeElement(self, nums, val):

        i = 0
        while i < len(nums):

            if nums[i] == val:
               nums.remove(nums[i])
            else:
                i += 1

        print(nums)
        nums = np.array(nums)
        return(nums)
        

solution = Solution()
answer = solution.removeElement(nums, val)
print(type(nums))
print(nums)