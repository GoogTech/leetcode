'''
Author: Goog Tech
Date: 2020-09-02 22:04:59
LastEditTime: 2020-09-02 22:05:14
Description: https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
FilePath: \leetcode-googtech\#921. Minimum Add to Make Parentheses Valid\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def minAddToMakeValid(self, S):
        """
        :type S: str
        :rtype: int
        """
        stack = []
        for ch in S:
            if not stack:
                stack.append(ch)
            else:
                if ch == ')' and stack[-1] == '(':
                    stack.pop()
                else:
                    stack.append(ch)
        return len(stack)
