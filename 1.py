from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        first_num = 0
        length = len(nums)
        while first_num < length - 1:
            # if first_num > target:
            #     first_num += 1
            #     continue
            second_num = first_num + 1
            while second_num < length:
                if nums[first_num] + nums[second_num] == target:
                    return [first_num, second_num]
                else:
                    second_num += 1
            first_num += 1
        return []

solution = Solution()
nums = [-1,-2,-3,-4,-5]
target = -8
print(solution.twoSum(nums, target))