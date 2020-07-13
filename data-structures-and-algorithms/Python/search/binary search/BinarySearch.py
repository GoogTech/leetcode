'''
@Author: Goog Tech
@Date: 2020-07-13 14:51:27
@Description: binary search
@FilePath: algorithm.show\leetcode-googtech\data-structures-and-algorithms\Python\search\binary search\BinarySearch.py
'''
class BinarySearch:

    '''
    @description: 二分搜索
    @param {alist,item} 
    @return: bool
    '''
    def orderedList(self,alist,item):
        first = 0
        last = len(alist) - 1
        found = False
        while first <= last and not found:
            midpoint = (first + last) // 2
            if alist[midpoint] == item:
                found = True
            else:
                if item < alist[midpoint]:
                    last = midpoint - 1
                else:
                    first = midpoint + 1
        return found


    '''
    @description: 使用递归实现二分搜索
    @param {alist,item} 
    @return: bool
    '''
    def recursionList(self,alist,item):
        if len(alist) == 0:
            return False
        else:
            midpoint = len(alist) // 2
            if alist[midpoint] == item:
                return True
            else:
                if item < alist[midpoint]:
                    return recursionList(alist[:midpoint],item)
                else:
                    return recursionList(alist[midpoint+1:],item) # NameError: name 'recursionList' is not defined
        
ds = BinarySearch()
print(ds.orderedList([1,2,3,4,5,6],7)) # False
print(ds.recursionList([1,2,3,4,5,6],6)) # True
