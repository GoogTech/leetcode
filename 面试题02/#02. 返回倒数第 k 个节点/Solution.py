'''
@Author: Goog Tech
@Date: 2020-07-16 18:22:09
@Description: https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
@FilePath: \leetcode-googtech\面试题02\#02. 返回倒数第 k 个节点\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def kthToLast(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: int
        """
        alist = []
        # 逐个将ListNode节点转为为list元素
        while head != None:
            alist.append(head.val)
            head = head.next
        # 获取list中指定索引值
        return alist[-k]

"""
实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
注意：本题相对原题稍作改动

示例：
输入： 1->2->3->4->5 和 k = 2
输出： 4

说明：
给定的 k 保证是有效的。
"""
