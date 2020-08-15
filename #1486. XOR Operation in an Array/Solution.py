'''
Author: Goog Tech
Date: 2020-08-15 21:26:33
LastEditTime: 2020-08-15 21:32:16
Description: https://leetcode-cn.com/problems/xor-operation-in-an-array/
FilePath: \leetcode-googtech\#1486. XOR Operation in an Array\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1486 lang=python
#
# [1486] 数组异或操作
#

# @lc code=start
class Solution(object):
    def xorOperation(self, n, start):
        """
        :type n: int
        :type start: int
        :rtype: int
        """
        result = 0
        for i in range(n): result ^= (start + 2 * i);
        return result
# @lc code=end
