'''
Author: Goog Tech
Date: 2020-08-24 10:38:58
LastEditTime: 2020-08-24 10:58:47
Description: https://leetcode-cn.com/problems/add-two-numbers/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\2.两数相加.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=2 lang=python
#
# [2] 两数相加
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # 初始化预先指针pre,该指针的下一个节点指向真正的头结点head
        pre = ListNode(None)
        currentNode = pre
        # 初始化两链表节点与进位值之和
        s = 0
        # 循环遍历链表节点,若两个链表遍历完毕后进位值不为0,则将其作为新链表的尾节点
        while l1 or l2 or s:
            s += (l1.val if l1 else 0) + (l2.val if l2 else 0)
            # 获取个位数值并将其作为下一个节点的值,其中 1 % 10 = 1
            currentNode.next = ListNode(s % 10)
            # 向后移动一位当前指针
            currentNode = currentNode.next
            # 舍去最后一位数值进而获得进位值
            s //= 10
            # 判断当前链表节点是否为空
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        # 返回结果链表
        return pre.next
# @lc code=end
