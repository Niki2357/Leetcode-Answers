# works but kinda slow
class Solution(object):
    def majorityElement(self, nums):
        for num in nums:
            if nums.count(num) > len(nums)/2 :
                return num
            
# The intuition behind this approach is that if an element 
# occurs more than n/2 times in the array (where n is the 
# size of the array), it will always occupy the middle position 
# when the array is sorted. Therefore, we can sort the array and 
# return the element at index n/2.
class Solution(object):
    def majorityElement(self, nums):
        n = len(nums)
        nums.sort()
        k = nums[n/2]
        return k
