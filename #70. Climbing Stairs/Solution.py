'''
Author: Goog Tech
Date: 2020-09-16 13:39:52
LastEditTime: 2020-09-16 13:40:15
Description: https://leetcode-cn.com/problems/climbing-stairs/
FilePath: \leetcode-googtech\#70. Climbing Stairs\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划
    # 解题思路 : 爬 i 层楼梯的方式数 = 爬 i-2 层楼梯的方式数 + 爬 i-1 层楼梯的方式数,
    # 所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        # 还是 DP,只不过只存储了前两个元素,将空间复杂度降低到 O(1)
        if n == 1 or n == 2: return n
        n_1, n_2, result = 1, 2, 0
        for i in range(3, n + 1):
            result = n_1 + n_2
            n_1 = n_2
            n_2 = result
        return result
