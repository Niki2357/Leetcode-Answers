nums = [0,1,2,2,3,0,4,2]
val = 2
class Solution(object):
    def removeElement(self, nums, val):
        length = len(nums)
        k = len(nums)
        for i in range(length):
            if nums[i] == val:
                k -= 1
                nums[i] = -1
        nums.sort(reverse=True)
        nums = nums[0:k]
        print(nums,k)
        

solution = Solution()
answer = solution.removeElement(nums, val)