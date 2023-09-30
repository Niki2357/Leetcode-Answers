from typing import List

class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)
        rotated = [0] * n
        for i in range(n):
            rotated[(i + k) % n] = nums[i]
        nums[:] = rotated  # nums = rotated doesn't change nums; it has to be nums[:]

solution = Solution()
k = 3
nums = [1, 2, 3, 4, 5, 6, 7]
solution.rotate(nums, k)
print(nums)