class Solution:
    def trailingZeroes(self, n: int) -> int:
        x = 0;
        while n >= 5:
            x += int(n/5)
            n = int(n/5)
        return x