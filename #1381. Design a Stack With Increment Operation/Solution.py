'''
Author: Goog Tech
Date: 2020-09-02 21:59:31
LastEditTime: 2020-09-02 22:00:04
Description: https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/
FilePath: \leetcode-googtech\#1381. Design a Stack With Increment Operation\Solution.py
WebSite: https://algorithm.show/
'''

class CustomStack(object):

    def __init__(self, maxSize):
        """
        :type maxSize: int
        """
        self.stack = [] * maxSize
        self.maxSize = maxSize

    def push(self, x):
        """
        :type x: int
        :rtype: None
        """
        if len(self.stack) < self.maxSize:
            self.stack.append(x)

    def pop(self):
        """
        :rtype: int
        """
        if self.stack:
            return self.stack.pop()
        else:
            return -1

    def increment(self, k, val):
        """
        :type k: int
        :type val: int
        :rtype: None
        """
        for i in range(min(k, len(self.stack))): 
            self.stack[i] += val

# Your CustomStack object will be instantiated and called as such:
# obj = CustomStack(maxSize)
# obj.push(x)
# param_2 = obj.pop()
# obj.increment(k,val)
