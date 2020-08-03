'''
Author: Goog Tech
Date: 2020-08-03 16:48:16
LastEditTime: 2020-08-03 18:04:48
Description: https://leetcode-cn.com/problems/valid-palindrome-ii/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.py
'''

#
# @lc app=leetcode.cn id=680 lang=python
#
# [680] 验证回文字符串 Ⅱ
#

# @lc code=start
class Solution(object):
    # 双指针法
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """

        # 判断字符串是否为回文
        def isPalindrome(s):
            return s == s[::-1]

        s = list(s)
        left = 0
        right = len(s) - 1
        # 遍历字符串,判断头尾指针所指的字符是否相等
        while left < right:
            if s[left] != s[right]:
                # 两种情况: 删除头指针或尾指针所指字符,然后再次判断其是否为回文
                return isPalindrome(s[left + 1:right + 1]) or isPalindrome(
                    s[left:right])
            left, right = left + 1, right - 1
        return True
# @lc code=end
