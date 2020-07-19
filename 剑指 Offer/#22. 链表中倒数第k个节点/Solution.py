'''
@Author: Goog Tech
@Date: 2020-07-19 22:06:56
@Description: https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
@FilePath: \leetcode-googtech\剑指 Offer\#22. 链表中倒数第k个节点\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    # 快慢指针法
    def getKthFromEnd(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        fastNode = slowNode = head
        # 先让快指针走k步
        while k>0:
            fastNode = fastNode.next
            k-=1
        # 然后两个指针同步走
        # 当快指针走到头时,慢指针就是链表倒数第k个节点
        while fastNode:
            fastNode = fastNode.next
            slowNode = slowNode.next
        return slowNode
