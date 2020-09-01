'''
Author: Goog Tech
Date: 2020-09-01 23:41:39
LastEditTime: 2020-09-01 23:42:04
Description: https://leetcode-cn.com/problems/make-the-string-great/
FilePath: \leetcode-googtech\#1544. Make The String Great\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def makeGood(self, s):
        """
        :type s: str
        :rtype: str
        """
        # 初始化辅助栈
        stack = []
        # 逐个遍历字符串中的字符
        for ch in s:
            # 判断栈是否为空,或当前字符与栈顶元素是否为相同字母( 相同字母大小写的 ASCII 码相差 32 )
            if not stack or abs(ord(stack[-1]) - ord(ch)) != 32:
                # 若满足条件则将当前字母压入栈中
                stack.append(ch)
            # 反之则弹出栈顶元素
            else:
                stack.pop()
        # 逐个遍历栈中元素并将其转换为字符串,最后其返回结果
        return "".join(ch for ch in stack)
