from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buy = 0
        
        while buy < len(prices) - 1:
            sell = buy + 1
            while sell < len(prices):
                if prices[sell] < prices[sell - 1]:
                    break
                sell += 1
            profit += prices[sell - 1] - prices[buy]
            buy = sell

        return profit

s = Solution()
prices = [1,2,3,4,5]
print(s.maxProfit(prices))
