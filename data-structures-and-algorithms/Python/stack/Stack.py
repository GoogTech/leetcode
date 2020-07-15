'''
@Author: Goog Tech
@Date: 2020-07-13 14:51:27
@Description: stack
@FilePath: algorithm.show\leetcode-googtech\data-structures-and-algorithms\Python\stack\Stack.py
'''

'''
@description: Simple Stack
'''
class Stack:

    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self,item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items)-1]
    
    def size(self):
        return len(self.items)


'''
@description: Match Brace By Stack
'''
class MatchBrace:

    '''
    @description: 匹配括号
    @param {string} 
    @return: bool
    '''
    def parChecker(self,symbolString):
        stack = Stack()
        balanced  = True
        index = 0
        while index < len(symbolString) and balanced:
            symbol = symbolString[index]
            if symbol == "(":
                stack.push(symbol)
            else:
                if stack.isEmpty():
                    balanced = False
                else:
                    stack.pop()
            index = index + 1
        if balanced and stack.isEmpty():
            return True
        else:
            return False

    '''
    @description: 匹配不同类型的括号
    @param {string} 
    @return: bool
    '''
    def parCheckerPlus(self,symbolString):
        stack = Stack()
        balanced = True
        index = 0
        while index < len(symbolString) and balanced:
            symbol = symbolString[index]
            if symbol in "<([{":
                stack.push(symbol)
            else:
                if stack.isEmpty():
                    balanced = False
                else:
                    top = stack.pop()
                    opens = "<([{"
                    closers = ">)]}"
                    if opens.index(top) != closers.index(symbol):
                        balanced = False
            index = index + 1
        if balanced and stack.isEmpty():
            return True
        else:
            return False
    
    '''
    @description: 将十进制转换为任意进制数
    @param {int,int} 
    @return: 
    '''
    def baseConverter(self,decNumber,base):
        digits = "0123456789ABCDEF"
        remstack = Stack()
        while decNumber > 0:
            rem = decNumber % base # 9,14
            remstack.push(rem)
            decNumber = decNumber // base # 14, 0
        newString  = ""
        while not remstack.isEmpty():
            print(remstack.pop())
            newString = newString + digits[remstack.pop()] # 14->E, 9->9
        return newString


'''
@description: 测试
'''
mb = MatchBrace()
print(mb.parChecker("(((((((((())))))))))")) # True
print(mb.parChecker("(((((((((()))))))))")) # False: 少个 ")"
print(mb.parCheckerPlus("(({{[[<<>>]]}}))")) # True
print(mb.parCheckerPlus("(({{[[<<<>>]]}}))")) # False: 少个 ">"
print(mb.baseConverter(233,16)) # 将十进制 233 转换为十六进制的结果为: E9
