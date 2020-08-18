'''
Author: Goog Tech
Date: 2020-08-18 09:44:05
LastEditTime: 2020-08-18 09:58:18
Description: https://leetcode-cn.com/problems/reverse-linked-list/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\206.反转链表.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=206 lang=python
#
# [206] 反转链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):

    # 双指针迭代法
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # 初始化前后指针,临时指针用于辅助currentNode指针移动
        previousNode, currentNode, tempNode = None, head, None
        # 遍历链表
        while currentNode:
            # 记录当前指针的下一个节点
            tempNode = currentNode.next
            # 将当前节点指向前节点previousNode
            currentNode.next = previousNode
            # 继续向后移动前后指针
            previousNode = currentNode
            currentNode = tempNode
        # 当迭代完毕时currentNode指向null,而previousNode指向最后一个节点
        return previousNode
# @lc code=end
