'''
Author: Goog Tech
Date: 2020-09-01 19:24:33
LastEditTime: 2020-09-01 19:24:55
Description: https://leetcode-cn.com/problems/implement-stack-using-queues/
FilePath: \leetcode-googtech\#225. Implement Stack using Queues\Solution.py
WebSite: https://algorithm.show/
'''

class MyStack(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        # 初始化辅助队列
        self.queue = deque()


    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: None
        """
        # 将当前元素入队
        self.queue.append(x)
        # 因入队顺序为先进先出,而栈则为先进后出,所以需要反转队列中的元素
        for _ in range(len(self.queue) - 1):
            self.queue.append(self.queue.popleft())

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        # 弹出队首元素
        return self.queue.popleft()


    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        # 获取队首元素
        return self.queue[0]


    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        # 判断队列是否为空
        return len(self.queue) == 0



# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()
