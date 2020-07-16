'''
@Author: Goog Tech
@Date: 2020-07-16 17:42:24
@Description: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
@FilePath: \leetcode-googtech\剑指 Offer\#06. 从尾到头打印链表\Solution.py
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def reversePrint(self, head):
        """
        :type head: ListNode
        :rtype: List[int]
        """
        # 初始化栈
        stack = []
        # 入栈
        while head:
            stack.append(head.val)
            head = head.next
        result = []
        # 出栈
        while stack:
            result.append(stack.pop())
        return result

"""
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1:
输入：head = [1,3,2]
输出：[2,3,1]

限制:
0 <= 链表长度 <= 10000
"""
