'''
Author: Goog Tech
Date: 2020-09-27 17:40:32
LastEditTime: 2020-09-27 17:40:57
Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
FilePath: \leetcode-googtech\#236. Lowest Common Ancestor of a Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归解法 \U0001f635
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        if not root or root.val == p.val or root.val == q.val: return root;
        left = self.lowestCommonAncestor(root.left, q, p)
        right = self.lowestCommonAncestor(root.right, q, p)
        if left and right: return root
        return right if left is None else left
