'''
Author: Goog Tech
Date: 2020-09-14 17:25:59
LastEditTime: 2020-09-14 17:28:45
Description: https://leetcode-cn.com/problems/balanced-binary-tree/
FilePath: \leetcode-googtech\#110. Balanced Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# 递归的三个条件 : 左平衡,右平衡,当前节点平衡.
class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        if not root: return True
        return self.isBalanced(root.left) and self.isBalanced(root.right) and abs(self.height(root.left) - self.height(root.right)) <= 1

    def height(self,root:TreeNode) -> int:
        if not root: return 0
        return max(self.height(root.left), self.height(root.right)) + 1
