'''
Author: Goog Tech
Date: 2020-09-27 17:32:11
LastEditTime: 2020-09-27 17:33:49
Description: https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#68 - II. 二叉树的最近公共祖先\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归解法 😵
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
