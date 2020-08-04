'''
Author: Goog Tech
Date: 2020-08-04 10:55:29
LastEditTime: 2020-08-04 11:10:18
Description: https://leetcode-cn.com/problems/reverse-words-in-a-string/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.py
'''

#
# @lc app=leetcode.cn id=151 lang=python
#
# [151] 翻转字符串里的单词
#

# @lc code=start
class Solution(object):

    # 双指针法
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        # 去除字符串的首位空格
        s = s.strip()
        # 初始化双节点,使得left与right指向字符串的尾字符
        left = right = len(s) - 1
        # 通过移动左指针来检查字符串中是否含有单词
        while left >= 0:
            # left指针向左移动: 寻找第一个空格
            while left >= 0 and s[left] != ' ': left -= 1
            # 将单词添加到结果列表
            result.append(s[left + 1 : right + 1])
            # 跳过单词之间的空格
            while left >= 0 and s[left] == ' ': left -= 1
            # 使得right指向下个单词的尾字符
            right = left
        # 将结果列表用空格拼接为字符串并返回
        return ' '.join(result)

# @lc code=end
