'''
Author: Goog Tech
Date: 2020-09-07 08:16:08
LastEditTime: 2020-09-07 08:17:10
Description: https://leetcode-cn.com/problems/design-circular-queue/
FilePath: \leetcode-googtech\#622. Design Circular Queue\Solution.py
WebSite: https://algorithm.show/
'''

class MyCircularQueue(object):

    def __init__(self, k):
        """
        Initialize your data structure here. Set the size of the queue to be k.
        :type k: int
        """
        self.front = 0 # 指向队头元素
        self.rear = 0 # 指向队尾元素的下一个元素
        self.capacity = k + 1 # 声明数组容量
        self.array = [0 for _ in range(self.capacity)] # 使用数组实现循环队列

    def enQueue(self, value):
        """
        Insert an element into the circular queue. Return true if the operation is successful.
        :type value: int
        :rtype: bool
        """
        if self.isFull(): return False
        self.array[self.rear] = value
        self.rear = (self.rear + 1) % self.capacity;
        return True;

    def deQueue(self):
        """
        Delete an element from the circular queue. Return true if the operation is successful.
        :rtype: bool
        """
        if self.isEmpty(): return False
        self.front = (self.front + 1) % self.capacity
        return True
        
    def Front(self):
        """
        Get the front item from the queue.
        :rtype: int
        """
        if self.isEmpty(): return -1
        return self.array[self.front]
        
    def Rear(self):
        """
        Get the last item from the queue.
        :rtype: int
        """
        if self.isEmpty(): return -1
        return self.array[(self.rear - 1 + self.capacity) % self.capacity]
        
    def isEmpty(self):
        """
        Checks whether the circular queue is empty or not.
        :rtype: bool
        """
        return self.front == self.rear
        
    def isFull(self):
        """
        Checks whether the circular queue is full or not.
        :rtype: bool
        """
        # 为了避免 “队列为空” 和 “队列未满” 的判别条件冲突,有意浪费一个元素空间
        # 即当 rear 循环到数组的前面,要从后面追上 front,还差一格的时候判定为队列为满
        return (self.rear + 1) % self.capacity == self.front
        
# Your MyCircularQueue object will be instantiated and called as such:
# obj = MyCircularQueue(k)
# param_1 = obj.enQueue(value)
# param_2 = obj.deQueue()
# param_3 = obj.Front()
# param_4 = obj.Rear()
# param_5 = obj.isEmpty()
# param_6 = obj.isFull()
