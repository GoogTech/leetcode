'''
@Author: Goog Tech
@Date: 2020-07-17 07:17:03
@Description: https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/solution/python-dan-zhi-zhen-by-hongge/
@FilePath: \leetcode-googtech\剑指 Offer\#18. 删除链表的节点\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def deleteNode(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        currentNode = head
        # 判断头节点是否为空
        if not head:
            return head
        # 判断待删节点是否为头节点
        if head.val == val:
            return head.next
        # 判断当前节点的下一个节点的下一个节点是否为待删节点
        while currentNode.next:
            if currentNode.next.val == val:
                currentNode.next = currentNode.next.next
                break
            currentNode = currentNode.next
        return head
