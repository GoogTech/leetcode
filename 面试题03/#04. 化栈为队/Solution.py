'''
Author: Goog Tech
Date: 2020-08-31 16:17:22
LastEditTime: 2020-08-31 16:19:33
Description: https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/
FilePath: \leetcode-googtech\面试题03\#04. 化栈为队\Solution.py
WebSite: https://algorithm.show/
'''

# 解题思路: 每次入队时把数据压入 StackWrite,
# 每次读数据时先将 StackWrite 中的数据压入到 StackRead,
# 这时 StackRead 中的栈顶元素就是我们所期望的队首元素咯
# refer to: https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/comments/319121

class MyQueue(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        # 声明两个辅助栈,其分别用于存储与读取数据
        self.stackWrite = []
        self.stackRead = []

    def push(self, x):
        """
        Push element x to the back of queue.
        :type x: int
        :rtype: None
        """
        self.stackWrite.append(x)


    def pop(self):
        """
        Removes the element from in front of queue and returns that element.
        :rtype: int
        """
        # 在出队的时要注意一点: 如果 StackRead 中有数据,那么就直接取 StackRead 的栈顶元素
        # 如果 StackRead 为空则先将 StackWrite 中的元素压入 StackRead 中,再取 StackRead 的栈顶元素
        # if len(self.stackRead) == 0:
        #     while self.stackWrite: self.stackRead.append(self.stackWrite.pop())
        self.peek()
        return self.stackRead.pop()

    def peek(self):
        """
        Get the front element.
        :rtype: int
        """
        if len(self.stackRead) == 0:
            while self.stackWrite: self.stackRead.append(self.stackWrite.pop())
        return self.stackRead[-1]

    def empty(self):
        """
        Returns whether the queue is empty.
        :rtype: bool
        """
        return True if not self.stackWrite and not self.stackRead else False


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()
