'''
@Author: Goog Tech
@Date: 2020-07-27 18:37:11
@Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\21.合并两个有序链表.py
'''

#
# @lc app=leetcode.cn id=21 lang=python
#
# [21] 合并两个有序链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    # 迭代法
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        # 判断链表是否为空
        if not l1 or not l2: return l2 or l1
        # 初始化哨兵节点与其头指针
        preHead = ListNode(-1)
        currentNode = preHead
        # 遍历链表并逐个比较两个节点大小,通过移动哨兵节点指针来构建新链表
        while l1 and l2:
            if l1.val >= l2.val: currentNode.next, l2 = l2, l2.next
            else: currentNode.next, l1 = l1, l1.next
            # 每比较一次,哨兵头指针都需要往后移动一位
            currentNode = currentNode.next
        #l1与l2合并结束后,最多还剩一个链表是非空的,这时需将链表末尾指向未合并完的链表
        currentNode.next = l2 if l2 is not None else l1
        return preHead.next


# @lc code=end
