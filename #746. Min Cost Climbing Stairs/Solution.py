'''
Author: Goog Tech
Date: 2020-09-23 21:16:40
LastEditTime: 2020-09-23 21:17:16
Description: https://leetcode-cn.com/problems/min-cost-climbing-stairs/
FilePath: \leetcode-googtech\#746. Min Cost Climbing Stairs\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划
    # 设达到第 i 阶楼梯的最小代价为f(i),则 f(i) = min(f(i - 1), f(i - 2)) + cost[i]
    # 从而达到楼顶的最小代价为最后到达两个台阶的最小代价中的较小者
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        N = len(cost)
        dp = [0] * N
        dp[0] = cost[0]
        dp[1] = cost[1]
        for i in range(2, N):
            dp[i] = min(dp[i-2], dp[i-1]) + cost[i]
        return min(dp[-2], dp[-1])
