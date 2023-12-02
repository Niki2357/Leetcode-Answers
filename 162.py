from typing import List
class Solution:
    def helper(self, nums: List[int], left, right) -> int:
        mid = (int) ((left + right) / 2)
        if mid == 0 or mid == len(nums) - 1:
            if nums[0] > nums[len(nums) - 1]:
                return 0
            else:
                return len(nums) - 1
        if (nums[mid - 1] < nums[mid] and nums[mid + 1] < nums[mid]):
            return mid
        elif nums[mid - 1] > nums[mid]:
            return self.helper(nums,left,mid)
        else:
            return self.helper(nums,mid + 1,right)

    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        left = 0
        right = len(nums) - 1
        return self.helper(nums, left, right)
    
s = Solution()
nums = [1,2,3]
output = s.findPeakElement(nums)
print(output)