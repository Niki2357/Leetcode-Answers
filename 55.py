from typing import List


class Solution:
    def canJump(self, nums: List[int]) -> bool:
        index = len(nums) - 1
        # output = True
        index2 = index
        while index2 >= 0:

            if nums[index2] + index2 >= index:
                print(nums[index2], " can be reached by ", nums[index2],"+" ,index2)
                index = index2
            index2 -= 1

            
        return True if (index == 0) else False


            
        
solution = Solution()
nums = [3,2,1,0,4]
# nums = [2,3,1,1,4]
print(solution.canJump(nums))