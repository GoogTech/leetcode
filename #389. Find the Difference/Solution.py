'''
Author: Goog Tech
Date: 2020-08-24 15:42:44
LastEditTime: 2020-08-24 15:43:35
Description: https://leetcode-cn.com/problems/find-the-difference/
FilePath: \leetcode-googtech\#389. Find the Difference\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # 解题思路: 遍历字符串,通过比较字符出现的次数即可得到新插入的字符
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        for i in range(len(t)):
            if t.count(t[i]) != s.count(t[i]):
                return t[i]
