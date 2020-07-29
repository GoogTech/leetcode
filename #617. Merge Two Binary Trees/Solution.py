'''
@Author: Goog Tech
@Date: 2020-07-29 09:01:01
@LastEditTime: 2020-07-29 09:12:01
@Description: https://leetcode-cn.com/problems/merge-two-binary-trees/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\617.合并二叉树.py
'''

#
# @lc app=leetcode.cn id=617 lang=python
#
# [617] 合并二叉树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 迭代法
    def mergeTrees(self, t1, t2):
        """
        :type t1: TreeNode
        :type t2: TreeNode
        :rtype: TreeNode
        """
        # 若其中一棵树为空,则返回另一颗树作为结果
        if not t1: return t2
        if not t2: return t1
        # 若两棵树当前节点都不为空,则将它们的值相加,并且对它们的左右孩子节点进行递归合并
        t1.val += t2.val
        t1.left = self.mergeTrees(t1.left, t2.left)
        t1.right = self.mergeTrees(t1.right, t2.right)
        return t1
        
# @lc code=end
