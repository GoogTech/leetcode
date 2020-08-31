'''
Author: Goog Tech
Date: 2020-08-31 14:02:17
LastEditTime: 2020-08-31 14:03:04
Description: https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
FilePath: \leetcode-googtech\面试题02\#01. 移除重复节点\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def removeDuplicateNodes(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # 初始化 hashSet 集合
        hashSet = set()
        # 为了移动指针时不破坏链表结构,初始化虚拟头节点以及 prev 哨兵节点
        prev = ListNode(-1)
        prev.next = head
        # 循环遍历链表
        while prev.next:
            # 若遇到重复值则将当前节点 prev 的 next 指向 next.next,即删除其后的节点
            if prev.next.val in hashSet:
                prev.next = prev.next.next
            # 反之利用 set 储存已有的节点值,并继续向后移动 prev 节点指针,寻找重复值
            else:
                hashSet.add(prev.next.val)
                prev = prev.next
        # 返回移除重复元素后的链表头节点
        return head
