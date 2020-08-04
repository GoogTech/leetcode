'''
Author: Goog Tech
Date: 2020-08-04 11:14:21
LastEditTime: 2020-08-04 11:46:24
Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
FilePath: \leetcode-googtech\#160. Intersection of Two Linked Lists\Solution.py
'''

#
# @lc app=leetcode.cn id=160 lang=python
#
# [160] 相交链表
#

# @lc code=start
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
            # 如果nodeA到了末尾,则令nodeA = headB,然后继续遍历
            nodeA = nodeA.next if nodeA else headB
            # 如果nodeB到了末尾,则令nodeB = headA,然后继续遍历
            nodeB = nodeB.next if nodeB else headA
        return nodeA
        
# @lc code=end
