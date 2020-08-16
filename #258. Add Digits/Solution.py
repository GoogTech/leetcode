'''
Author: Goog Tech
Date: 2020-08-16 14:25:08
LastEditTime: 2020-08-16 14:25:22
Description: https://leetcode-cn.com/problems/add-digits/
FilePath: \leetcode-googtech\#258. Add Digits\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        if num < 10: return num
        return 9 if num % 9 == 0 else num % 9
