'''
@Author: Goog Tech
@Date: 2020-07-15 23:29:15
@Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
@FilePath: \leetcode-googtech\#237. Delete Node in a Linked List\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        node.val = node.next.val # 前移待删除节点的后一个节点的值
        node.next = node.next.next # 更新待删除节点的指针

"""
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
"""
