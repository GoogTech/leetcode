'''
@Author: Goog Tech
@Date: 2020-07-22 19:59:53
@Description: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
@FilePath: \leetcode-googtech\#19. Remove Nth Node From End of List\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    # 双指针法
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # 快指针指向待删节点的后一个节点
        # 慢指针指向待删节点的前一个节点
        firstNode, slowNode = head, head
        # 移动快指针,使其指向待删节点的前一个节点
        for i in range(n):
            firstNode = firstNode.next
        # 待删节点即为第一个节点
        if firstNode is None:
            return head.next
        # 同时移动快慢指针
        # 当快指针指向尾节点时,慢指针指向待删节点的前一个节点
        while firstNode.next != None:
            firstNode = firstNode.next
            slowNode = slowNode.next
        # 更新待删节点的前节点的指针,即移除待删节点
        slowNode.next = slowNode.next.next
        return head
