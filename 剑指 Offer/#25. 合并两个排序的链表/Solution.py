'''
Author: Goog Tech
Date: 2020-08-18 15:19:51
LastEditTime: 2020-08-18 15:20:33
Description: https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#25. 合并两个排序的链表\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):

    # 迭代法
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # 判断头节点是否为空
        if not l1 or not l2: return l2 or l1
        # 初始化哨兵节点及其头指针
        previousHead = ListNode(-1)
        currentNode = previousHead
        # 遍历链表并逐个比较两节点值的大小,并通过移动哨兵节点指针来构建新链表
        while l1 and l2:
            if l1.val >= l2.val: currentNode.next, l2 = l2, l2.next
            else: currentNode.next, l1 = l1, l1.next
            # 每次比较后都需要将哨兵节点指针往后移动一位
            currentNode = currentNode.next
        # l1与l2合并结束后,最后还剩一个链表是非空的,这时只需将链表尾指针指向未合完的链表即可
        currentNode.next = l2 if l2 is not None else l1
        # 返回哨兵节点所指的已排序好的链表的头节点
        return previousHead.next
