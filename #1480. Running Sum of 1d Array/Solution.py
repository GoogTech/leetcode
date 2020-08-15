'''
Author: Goog Tech
Date: 2020-08-15 12:03:38
LastEditTime: 2020-08-15 12:16:49
Description: https://leetcode-cn.com/problems/running-sum-of-1d-array/
FilePath: \leetcode-googtech\#1480. Running Sum of 1d Array\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1480 lang=python
#
# [1480] 一维数组的动态和
#

# @lc code=start
class Solution(object):

    # 动态规划法
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # 从第二个元素开始遍历数组, 即当前位置等于当前位置的值加上上一个位置的值
        for i in range(1, len(nums)): nums[i] = nums[i - 1] + nums[i]
        return nums
# @lc code=end
