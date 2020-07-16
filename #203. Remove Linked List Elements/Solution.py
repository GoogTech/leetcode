'''
@Author: Goog Tech
@Date: 2020-07-16 17:00:01
@Description: https://leetcode-cn.com/problems/remove-linked-list-elements/
@FilePath: \leetcode-googtech\#203. Remove Linked List Elements\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        # 初始化辅助节点
        newNode = ListNode(0)
        newNode.next = head

        # 初始化当前节点与前继节点指针
        previousNode,currentNode = newNode,head

        # 遍历寻找待删除节点
        while currentNode:
            if currentNode.val == val:
                previousNode.next = currentNode.next
            else:
                previousNode = currentNode
            currentNode = currentNode.next
        # 返回头节点: same as return head
        return newNode.next

"""
Remove all elements from a linked list of integers that have value val.

Example:
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
"""
