'''
@Author: Goog Tech
@Date: 2020-07-15 18:08:01
@Description: 双端队列
@FilePath: \leetcode-googtech\data-structures-and-algorithms\Python\queue\double-ended queue\dqueue.py
'''
class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def addFont(self, item):
        self.items.append(item)

    def addRear(self, item):
        self.items.insert(0, item)

    def removeFront(self):
        return self.items.pop()

    def removeRear(self):
        return self.items.pop(0)

    def size(self):
        return len(self.items)


'''
@description: 应用案例
'''
class Test:
    '''
    @description: 回文检测器
    @param {string} 
    @return: bool
    '''
    def palchecker(self, aString):
        queue = Queue()
        for ch in aString:
            queue.addRear(ch)
        stillEqual = True
        while queue.size() > 1 and stillEqual:
            first = queue.removeFront()
            last = queue.removeRear()
            if first != last:
                stillEqual = False
        return stillEqual


t = Test()
print(t.palchecker("GooG")) # True
