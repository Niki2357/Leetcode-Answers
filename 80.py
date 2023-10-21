from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k = len(nums)
        i = 0
        while i < len(nums):
            j = i + 2
            while j < len(nums):
                if nums[j] != nums[i]:
                    j -= 1
                    break
                else:
                    nums[j] = 10001 
                    k -= 1
                    j += 1
            i = j
        nums.sort()
        return k

s = Solution()
nums = [1,2,2,2]
print(s.removeDuplicates(nums))