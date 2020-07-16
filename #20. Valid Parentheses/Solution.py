'''
@Author: Goog Tech
@Date: 2020-07-16 20:45:17
@Description: https://leetcode-cn.com/problems/valid-parentheses/
@FilePath: \leetcode-googtech\#20. Valid Parentheses\Solution.py
'''
class Solution(object):
    def isValid(self, symbolString):
        """
        :type s: str
        :rtype: bool
        """
        index = 0
        stack = []
        opens = "([{"
        closers = ")]}"
        balanced = True
        # 遍历字符串中的字符(括号)
        while index < len(symbolString) and balanced:
            symbol = symbolString[index]
            # 将左括号压入栈中
            if symbol in opens:
                stack.append(symbol)
            else:
                # 如果栈不为空,弹出左括号并于右括号比较
                if stack:
                    top = stack.pop()
                    if opens.index(top) != closers.index(symbol):
                        balanced = False
                else:
                    balanced = False                 
            index = index + 1
        # 如果栈不为空或balanced为False,则匹配失败
        if stack or not balanced:
            return False
        else:
            return True
    
print(Solution().isValid("{[()]}")) # Test: True
