'''
Author: Goog Tech
Date: 2020-08-29 17:22:29
LastEditTime: 2020-08-29 17:23:00
Description: https://leetcode-cn.com/problems/remove-palindromic-subsequences/
FilePath: \leetcode-googtech\#1332. Remove Palindromic Subsequences\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    
    # 1.空字符串 删除 0 次
    # 2.回文字符窜 删除 1 次
    # 3.非回文字符串 删除 2 次 (一次删除全部a , 一次删除全部b)
    # 注: 回文子序列不是回文子字符串,比如"aababdaba",其中"aaaaa"就是它的回文子序列
    def removePalindromeSub(self, s):
        """
        :type s: str
        :rtype: int
        """
        return 0 if not s else 1 if s[::-1] == s else 2
