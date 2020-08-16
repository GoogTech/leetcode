'''
Author: Goog Tech
Date: 2020-08-16 09:17:39
LastEditTime: 2020-08-16 09:40:13
Description: https://leetcode-cn.com/problems/invert-binary-tree/
FilePath: \leetcode-googtech\#226. Invert Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=226 lang=python
#
# [226] 翻转二叉树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if not root: return None
        root.left, root.right = self.invertTree(root.right), self.invertTree(root.left)
        return root

    def invertTree(self, root):
        # 判断当前节点是否为空
        if not root: return None
        # 交换当前节点的左右孩子节点
        root.left, root.right = root.right, root.left
        # 递归交换当前节点的左右孩子节点
        self.invertTree(root.left)
        self.invertTree(root.right)
        # 函数返回时即表示当前节点及它的左右孩子节点都已交换完毕
        return root
# @lc code=end
