'''
Author: Goog Tech
Date: 2020-09-01 21:57:09
LastEditTime: 2020-09-01 22:28:26
Description: https://leetcode-cn.com/problems/min-stack/
FilePath: \leetcode-googtech\剑指 Offer\#30. 包含min函数的栈\Solution.py
WebSite: https://algorithm.show/
'''

class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        # 初始化两个辅助栈,其中 stack 用于存储元素,而 minStack 仅用于存储 stack 中的最小元素
        self.stack = []
        self.minStack = []

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        # 将元素压入 stack 栈中
        self.stack.append(x)
        # 若当前 minStack 为空或其顶部元素小于或等于当前压入的元素 x,则将 x 压入 minStack 栈中
        if not self.minStack or x <= self.minStack[-1]:
            self.minStack.append(x)

    def pop(self):
        """
        :rtype: None
        """
        # 弹出 stack 栈的顶部元素,若其与 minStack 栈的顶部元素相同,则也弹出 minStack 栈的顶部元素
        # 进而可以保证 minStack 的栈顶元素始终是 stack 栈中的最小值
        if self.stack.pop() == self.minStack[-1]:
            self.minStack.pop()

    def top(self):
        """
        :rtype: int
        """
        # 获取 stack 栈的顶部元素
        return self.stack[-1]

    def min(self):
        """
        :rtype: int
        """
        # 获取 minStack 栈的顶部元素,即所压入元素的最小值
        return self.minStack[-1]

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.min()
