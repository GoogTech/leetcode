'''
Author: Goog Tech
Date: 2020-08-24 17:00:05
LastEditTime: 2020-08-24 17:00:27
Description: https://leetcode-cn.com/problems/valid-anagram/
FilePath: \leetcode-googtech\#242. Valid Anagram\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # 判断两字符串的长度是否相同
        if len(s) != len(t): return False
        # 将 s 字符串转换为 set 集合(无重复性质),然后进行字符遍历
        for ch in set(s):
            # 判断当前字符在字符串 s 中出现的次数与 t 是否相等
            if s.count(ch) != t.count(ch):
                return False
        return True
