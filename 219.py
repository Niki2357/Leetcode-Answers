from typing import List

class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        dict = {}
        length = len(nums)
        for i in range(length):
            if nums[i] not in dict:
                dict[nums[i]] = i
            elif i - dict[nums[i]] <= k:
                return True
            else:
                dict[nums[i]] = i
                
        return False
    
solution = Solution()
nums = [1,2,3,1,2,3]
k = 2
print(solution.containsNearbyDuplicate(nums,k))