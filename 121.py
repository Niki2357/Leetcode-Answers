class Solution(object):
    def maxProfit(self, prices):
        max_profit = 0
        index_left = 0
        index_right = 1
        # if prices!= prices.sort(reverse=True):
        for index_left in range(len(prices)-1):
            for index_right in range(index_left+1,len(prices),):
                # print(index_right)
                # print('comparing', prices[index_left], prices[index_right])
                # print(prices,'---',prices[index_right])
                if prices[index_right]-prices[index_left] > max_profit:
                    max_profit = prices[index_right]-prices[index_left]
                    print(prices[index_right], prices[index_left])
        return max_profit
        
        
        
        
solution = Solution()
prices = [7,1,5,3,6,4]
profit = solution.maxProfit(prices)
print(profit)