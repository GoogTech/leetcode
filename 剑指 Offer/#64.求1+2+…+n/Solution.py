'''
Author: Goog Tech
Date: 2020-08-09 14:15:58
LastEditTime: 2020-08-09 14:16:47
Description: https://leetcode-cn.com/problems/qiu-12n-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#64.求1+2+…+n\Solution.py
'''

class Solution(object):
    def sumNums(self, n):
        """
        :type n: int
        :rtype: int
        """
        return sum(range(n + 1))
