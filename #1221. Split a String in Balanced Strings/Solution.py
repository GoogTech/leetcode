'''
Author: Goog Tech
Date: 2020-08-15 11:54:14
LastEditTime: 2020-08-15 11:58:43
Description: https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
FilePath: \leetcode-googtech\#1221. Split a String in Balanced Strings\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1221 lang=python
#
# [1221] 分割平衡字符串
#

# @lc code=start
class Solution(object):

    # 贪心算法
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        balance, result = 0, 0
        for ch in s:
            if ch == 'L': balance += 1
            elif ch == 'R': balance -= 1
            if balance == 0: result += 1
        return result
# @lc code=end
