'''
@Author: Goog Tech
@Date: 2020-07-21 21:15:26
@Description: https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
@FilePath: \leetcode-googtech\剑指 Offer\#55 - I. 二叉树的深度\Solution.py
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 后序遍历(DFS): 递归法
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        return max(self.maxDepth(root.left), self.maxDepth(root.right)) + 1
