'''
@Author: Goog Tech
@Date: 2020-07-18 22:41:18
@Description: https://leetcode-cn.com/problems/linked-list-cycle/
@FilePath: \leetcode-googtech\#141. Linked List Cycle\Solution.py
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        # # 置空法
        # # 判断头节点是否为空
        # if not head:
        #     return False
        # # 逐个将节点置为空
        # while head.next and head.val != None:
        #     head.val = None
        #     head = head.next
        # # 若碰到空节点则无环
        # if not head.next:
        #     return False
        # return True

        # 快慢指针法
        # 如果有环,经多次遍历后慢指针与快指针一定会在环中的某个结点相遇
        fastNode = slowNode = head
        while fastNode and fastNode.next:
            fastNode = fastNode.next.next
            slowNode = slowNode.next
            if fastNode == slowNode:
                return True
        return False
