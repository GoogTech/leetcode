'''
@Author: Goog Tech
@Date: 2020-07-13 14:51:27
@Description: sequential search
@FilePath: algorithm.show\leetcode-googtech\data-structures-and-algorithms\Python\search\sequential search\SequentialSearch.py
'''
class SequentialSearch:
    
    '''
    @description: 无序列表的顺序搜索
    @param {alist,item} 
    @return: bool
    '''
    def unorderedList(self,alist, item):
        pos = 0;
        found = False
        while pos < len(alist) and not found:
            if alist[pos] == item:
                found = True
            else:
                pos = pos + 1
        return found


    '''
    @description: 有序列表的顺序搜索
    @param {alist,item} 
    @return: bool
    '''
    def orderedList(self,alist,item):
        pos = 0;
        found = False
        stop = False
        while pos < len(alist) and not found and not stop:
            if alist[pos] == item:
                found = True
            else:
                pos = pos + 1
        return found

s = SequentialSearch()
print(s.unorderedList([1,2,3,4,5,6],7)) # False
print(s.orderedList([1,2,3,4,5,6],6)) # True
