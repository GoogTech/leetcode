'''
Author: Goog Tech
Date: 2020-09-15 13:44:20
LastEditTime: 2020-09-15 13:44:46
Description: https://leetcode-cn.com/problems/maximum-subarray/
FilePath: \leetcode-googtech\#53. Maximum Subarray\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # DP : 动态规划
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        for i in range(1, len(nums)):
            if nums[i - 1] > 0: 
                nums[i] += nums[i - 1]
        return max(nums)
