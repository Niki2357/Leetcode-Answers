class Solution(object):
    def removeDuplicates(self, nums):
        i = 1
        k = 0
        while i < len(nums):
            if nums[i] != nums[k]:
                nums[k+1] = nums[i]
                k += 1
            i += 1
        return(k+1)
    
solution = Solution()
nums = [0,0,1,1,1,2,2,3,3,4]
print('\n',solution.removeDuplicates(nums))
print(nums)
            