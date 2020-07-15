'''
@Author: Goog Tech
@Date: 2020-07-15 17:29:37
@Description: 单端队列
@FilePath: \leetcode-googtech\data-structures-and-algorithms\Python\queue\single-ended queue\squeue.py
'''
class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.insert(0, item)

    def dequeue(self):
        return self.items.pop()

    def size(self):
        return len(self.items)


'''
@description: 应用实例
'''
class Test:
    '''
    @description: 传土豆模拟程序
    @param {list,int} 
    @return: last node of queue
    '''
    def hotPotato(self, namelist, num):
        simqueue = Queue()
        for name in namelist:
            simqueue.enqueue(name)
        while simqueue.size() > 1:
            for i in range(num):
                simqueue.enqueue(simqueue.dequeue())
            simqueue.dequeue() # D, A, F, E, G, C
        return simqueue.dequeue()

t = Test()
print(t.hotPotato(["A", "B", "C", "D", "E", "F", "G"], 3))  # B
# A B C D E F G ——> delete D
# E F G A B C ——> delete A
# B C E F G ——> delete F
# G B C E ——> delete E
# G B C ——> delete G
# B C ——> delete C
# B
