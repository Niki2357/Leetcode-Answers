from typing import List
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        
        if len(nums) == 1:
            return [nums]
        # base case:
        if len(nums) == 2:
            return [[nums[0],nums[1]],[nums[1],nums[0]]]
        else:
            out = []
            for i in range(len(nums)):
                print(i)
                print(nums[0:i] ,nums[i+1:len(nums)])
                temp = self.permute(nums[0:i] + nums[i+1:len(nums)])
                for thing in temp:
                    out.append([nums[i]]+thing)
        return out

s = Solution()
nums = [1,2,3]
print(s.permute(nums))