'''
Author: Goog Tech
Date: 2020-08-09 08:17:22
LastEditTime: 2020-08-09 08:18:59
Description: https://leetcode-cn.com/problems/remove-outermost-parentheses/
FilePath: \leetcode-googtech\#1021. Remove Outermost Parentheses\Solution.py
'''

class Solution(object):
    def removeOuterParentheses(self, S):
        """
        :type S: str
        :rtype: str
        """
        level = 0
        result = []
        # 遍历字符串元素,并将最内层括号添加到result列表中
        for c in S:
            if c == ')': level -= 1
            if level >= 1: result.append(c)
            if c == '(': level += 1
        # 将结果列表转换为字符串并返回
        return ''.join(result)
