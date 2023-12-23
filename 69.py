class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 1:
            return 1
        
        low = 0
        high = x
        
        while low < high:
            mid = (low+high)//2
            print(mid)
            if mid*mid > x:
                high = mid
            else:
                if (mid+1)*(mid+1) > x:
                    return mid 
                low = mid
        return 0

s = Solution()
x = 1
print(s.mySqrt(x))