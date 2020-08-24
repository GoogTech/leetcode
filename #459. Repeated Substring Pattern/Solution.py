'''
Author: Goog Tech
Date: 2020-08-24 09:33:28
LastEditTime: 2020-08-24 09:34:25
Description: https://leetcode-cn.com/problems/repeated-substring-pattern/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\459.重复的子字符串.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=459 lang=python
#
# [459] 重复的子字符串
#

# @lc code=start
class Solution(object):

    # 解题思路: 判断str中去除首尾元素后是否包含自身元素,如果包含,则表明存在重复子串
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        return (s + s)[1 : len(s) * 2 - 1].find(s) != -1
# @lc code=end
