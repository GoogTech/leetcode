'''
Author: Goog Tech
Date: 2020-08-21 17:41:24
LastEditTime: 2020-08-21 17:41:49
Description: https://leetcode-cn.com/problems/maximum-69-number/
FilePath: \leetcode-googtech\#1323. Maximum 69 Number\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        return int(str(num).replace("6", "9", 1))
