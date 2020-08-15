'''
Author: Goog Tech
Date: 2020-08-15 17:52:11
LastEditTime: 2020-08-15 17:55:54
Description: https://leetcode-cn.com/problems/single-number/
FilePath: \leetcode-googtech\#136. Single Number\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=136 lang=python
#
# [136] 只出现一次的数字
#

# @lc code=start
class Solution(object):

    # 数组中的全部元素的异或运算结果即为数组中只出现一次的数字
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        single = 0
        for i in range(len(nums)): single ^= nums[i]
        return single
# @lc code=end
