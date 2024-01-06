class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2
        firstStair = 1
        secondStair = 2
        sum = 0
        for i in range(2,n):
            sum = firstStair + secondStair
            firstStair = secondStair
            secondStair = sum
        return sum

s = Solution()
n = 4
print(s.climbStairs(n))
