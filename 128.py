from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        map = {}
        nums = sorted(nums)
        if len(nums) == 0:
            return 0
        indexOfMap = 0
        i = 1
        map[0] = [nums[0]]
        while i < len(nums):
            if nums[i] == nums[i-1]:
                i += 1
                continue
            elif nums[i] == nums[i-1] + 1:
                
                map[indexOfMap].append(nums[i])
            else:
                indexOfMap += 1
                map[indexOfMap] = [nums[i]]
            i += 1
        print(map)
        max = 0
        for key, m in map.items():
            if len(m) > max:
                max = len(m)
        return max


s = Solution()
nums = [1,2,0,1]
print(s.longestConsecutive(nums))