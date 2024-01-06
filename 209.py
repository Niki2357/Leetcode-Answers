from typing import List

class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        length = len(nums)
        min_length = float('inf')
        left = 0
        sum = 0
        
        for right in range(length):
            sum += nums[right]
            while sum >= target:
                min_length = min(min_length, right - left + 1)
                sum -= nums[left]
                left += 1

        return min_length if min_length != float('inf') else 0

s = Solution()
target = 15
nums = [1, 2, 3, 4, 5]
print(s.minSubArrayLen(target, nums))

    


    # Original approach that doesn't work:

    # def minSubArrayLen(self, target: int, nums: List[int]) -> int:
    #     length = len(nums)
    #     # Find the biggest number:
    #     left = 0
    #     for i in range(length):
    #         if nums[i] > nums[left]:
    #             left = i
    #     print(left)
    #     sum = nums[left]
    #     if sum >= target:
    #         return 1
    #     right = left + 1
    #     # right = left
    #     left = left - 1
    #     print(left, right)
    #     while left >= 0 or right < length:
    #         if left >= 0 and (right >= length or nums[left] > nums[right]):
    #             sum += nums[left]
    #             left -= 1
    #         elif right < length:
    #             sum += nums[right]
    #             right += 1

    #         if sum >= target:
    #             return right - left - 1
    #     return 0
