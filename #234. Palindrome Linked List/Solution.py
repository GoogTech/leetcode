'''
@Author: Goog Tech
@Date: 2020-07-22 17:45:49
@Description: https://leetcode-cn.com/problems/palindrome-linked-list/
@FilePath: \leetcode-googtech\#234. Palindrome Linked List\Solution.py
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
        return values == values[::-1] # values[::-1] : 将values数组中元素顺序取反
