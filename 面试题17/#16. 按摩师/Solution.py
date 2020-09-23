'''
Author: Goog Tech
Date: 2020-09-23 21:58:46
LastEditTime: 2020-09-23 21:59:20
Description: https://leetcode-cn.com/problems/the-masseuse-lcci/
FilePath: \leetcode-googtech\面试题17\#16. 按摩师\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划
    # 设第 n 号的最大时长为 dp[n],解题思路如下:
    # 1. 若选择第 n 号的话,由于不能接受相邻的预约,所以 dp[n] = dp[n - 2] + nums[n] (即总时长等于 n - 2 号的总时长 + 第 n 号的时长)
    # 2. 反之若不选择 n 号的话,那么 dp[n] = dp[n - 1](即总时长为 n - 1 号的最大时长)
    def massage(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums: return 0
        length = len(nums)
        if length == 1: return nums[0]
        dp = [0] * length
        dp[0] = nums[0]
        dp[1] = max(nums[0], nums[1])
        for i in range(2, length):
            dp[i] = max(dp[i - 2] + nums[i], dp[i - 1])
        return dp[length - 1]
