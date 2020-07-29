'''
@Author: Goog Tech
@Date: 2020-07-29 09:22:52
@LastEditTime: 2020-07-29 09:45:28
@Description: https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\700.二叉搜索树中的搜索.py
'''

#
# @lc app=leetcode.cn id=700 lang=python
#
# [700] 二叉搜索树中的搜索
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    '''
    二叉搜索树是一棵二叉树，每个节点都具备特性: 大于左子树上任意一个节点的值，小于右子树上任意一个节点的值。
    解题思路如下:
    1.如果根节点为空 root == null 或者根节点的值等于搜索值 val == root.val，返回根节点
    2.如果 val < root.val，进入根节点的左子树查找 searchBST(root.left, val)
    3.如果 val > root.val，进入根节点的右子树查找 searchBST(root.right, val)
    '''
    def searchBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        # if root is None or val == root.val: return root
        # return self.searchBST(root.left, val) if val < root.val else self.searchBST(root.right, val)
        return root if root is None or val == root.val else self.searchBST(root.left, val) if val < root.val else self.searchBST(root.right, val)
# @lc code=end
