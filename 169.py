# works but kinda slow
# class Solution(object):
#     def majorityElement(self, nums):
#         for num in nums:
#             if nums.count(num) > len(nums)/2 :
#                 return num
            
# The intuition behind this approach is that if an element 
# occurs more than n/2 times in the array (where n is the 
# size of the array), it will always occupy the middle position 
# when the array is sorted. Therefore, we can sort the array and 
# return the element at index n/2.
# class Solution(object):
#     def majorityElement(self, nums):
#         n = len(nums)
#         nums.sort()
#         k = nums[n/2]
#         return k

from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        dict = {}
        index = 0
        while index < len(nums):
            if nums[index] not in dict:
                dict[nums[index]] = 1
                if dict[nums[index]] > int(len(nums)/2):
                    return nums[index]
            else:
                dict[nums[index]] += 1
                if dict[nums[index]] > int(len(nums)/2):
                    return nums[index]
            index += 1
        return 0        

s = Solution()
nums = [3,2,3]
print(s.majorityElement(nums))