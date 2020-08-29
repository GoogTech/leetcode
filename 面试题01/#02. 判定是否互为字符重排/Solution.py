'''
Author: Goog Tech
Date: 2020-08-29 16:59:34
LastEditTime: 2020-08-29 16:59:48
Description: https://leetcode-cn.com/problems/check-permutation-lcci/
FilePath: \leetcode-googtech\面试题01\#02. 判定是否互为字符重排\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def CheckPermutation(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        return len(s1) == len(s2) and set(s1) == set(s2)
