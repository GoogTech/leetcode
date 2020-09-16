'''
Author: Goog Tech
Date: 2020-09-16 14:19:03
LastEditTime: 2020-09-16 14:19:31
Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
FilePath: \leetcode-googtech\#121. Best Time to Buy and Sell Stock\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划思想
    # 解题思路 : 前 i 天的最大收益 = MAX(前 i-1 天的最大收益, 第 i 天的价格 - 前 i-1 天中的最小价格)
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) <= 1: return 0
        minPrice = prices[0]
        maxPrice = 0
        for i in range(len(prices)):
            minPrice = min(minPrice, prices[i])
            maxPrice = max(maxPrice, prices[i] - minPrice)
        return maxPrice
