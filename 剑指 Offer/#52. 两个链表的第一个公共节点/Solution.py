'''
Author: Goog Tech
Date: 2020-08-21 10:06:59
LastEditTime: 2020-08-21 10:08:05
Description: https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#52. 两个链表的第一个公共节点\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        # 判断头节点是否为空
        if not headA or not headB: return None
        # 题目要求: 勿破坏原链表结构
        nodeA, nodeB = headA, headB
        # 循环遍历链表
        while(nodeA != nodeB):
            # 若nodeA到了末尾,则令nodeA = headB,然后继续遍历
            nodeA = nodeA.next if nodeA else headB
            # 若nodeB到了末尾,则令nodeB = headA,然后继续遍历
            nodeB = nodeB.next if nodeB else headA
        # 返回结果
        return nodeA
