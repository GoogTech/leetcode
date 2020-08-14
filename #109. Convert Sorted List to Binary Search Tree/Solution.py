'''
Author: Goog Tech
Date: 2020-08-14 19:01:27
LastEditTime: 2020-08-14 19:23:33
Description: https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
FilePath: \leetcode-googtech\#109. Convert Sorted List to Binary Search Tree\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=109 lang=python
#
# [109] 有序链表转换二叉搜索树
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 双指针法
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        # 寻找中间节点: 当快指针fast走到末尾时,慢指针slow指向链表的中间节点
        def findmid(head, tail):
            fast, slow = head, head
            while fast != tail and fast.next != tail:
                slow = slow.next
                fast = fast.next.next
            return slow
        
        # 构建二叉树: 利用中序遍历构建二叉树
        def helper(head, tail):
            if head == tail: return 
            node = findmid(head, tail)
            root = TreeNode(node.val)
            root.left = helper(head, node)
            root.right = helper(node.next, tail)
            return root
        
        # 返回结果
        return helper(head, None)
# @lc code=end
