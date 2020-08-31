'''
Author: Goog Tech
Date: 2020-08-31 15:10:47
LastEditTime: 2020-08-31 15:12:02
Description: https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
FilePath: \leetcode-googtech\面试题02\#06. 回文链表\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        values = []
        currentNode = head
        while currentNode is not None:
            values.append(currentNode.val)
            currentNode = currentNode.next
        return values == values[::-1] # values[::-1] : 将 values 数组中的元素顺序取反
