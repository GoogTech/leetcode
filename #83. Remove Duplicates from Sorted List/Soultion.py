'''
@Author: Goog Tech
@Date: 2020-07-18 21:48:22
@Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
@FilePath: \leetcode-googtech\#83. Remove Duplicates from Sorted List\Soultion.py
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        currentNode = head
        # 判断头节点是否为空
        if not head:
            return head
        # 遍历寻找及删除重复节点
        while currentNode.next:
            if currentNode.val == currentNode.next.val:
                currentNode.next = currentNode.next.next
            else:
                currentNode = currentNode.next
        # 返回头节点
        return head
