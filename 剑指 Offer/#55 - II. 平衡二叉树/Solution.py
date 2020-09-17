'''
Author: Goog Tech
Date: 2020-09-17 10:02:46
LastEditTime: 2020-09-17 10:03:33
Description: https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#55 - II. 平衡二叉树\Solution.py
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
