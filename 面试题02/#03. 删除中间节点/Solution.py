'''
@Author: Goog Tech
@Date: 2020-07-19 22:29:49
@Description: https://leetcode-cn.com/problems/delete-middle-node-lcci/
@FilePath: \leetcode-googtech\面试题02\#03. 删除中间节点\Solution.py
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
        # 更新待删除节点的值及指针
        node.val = node.next.val
        node.next = node.next.next
