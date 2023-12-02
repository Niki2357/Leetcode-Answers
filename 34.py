from typing import List
class Solution:

    def searchLeft(self, nums: List[int], target: int) -> List[int]:
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            if nums[mid] == target and (mid == 0 or nums[mid - 1] != target):
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        
        return -1
    
    def searchRight(self, nums: List[int], target: int) -> List[int]:
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) // 2
            print(mid)
            if nums[mid] == target:
                if (mid == len(nums) - 1 or nums[mid + 1] != target):
                    return mid
                else: 
                    right += 1
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return -1

    def searchRange(self, nums: List[int], target: int) -> List[int]:
        return [self.searchLeft(nums,target),self.searchRight(nums, target)]


    # def searchRange(self, nums: List[int], target: int) -> List[int]:
    #     left = 0
    #     right = len(nums) - 1
    #     output = [-1,-1]
    #     while left < len(nums):
    #         if nums[left] == target:
    #             output[0] = left
    #             break
    #         else:
    #             left += 1
    #     while right >= 0:
    #         if nums[right] == target:
    #             output[1] = right
    #             break
    #         else:
    #             right -= 1
    #     return output
    
s = Solution()
nums = [1,1,2,2]
print(s.searchRange(nums, 2))