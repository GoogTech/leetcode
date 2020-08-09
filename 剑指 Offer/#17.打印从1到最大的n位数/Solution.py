'''
Author: Goog Tech
Date: 2020-08-09 13:56:06
LastEditTime: 2020-08-09 13:57:03
Description: https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#17.打印从1到最大的n位数\Solution.py
'''

class Solution(object):
    def printNumbers(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        return range(1, 10 ** n);
