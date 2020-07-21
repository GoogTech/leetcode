'''
@Author: Goog Tech
@Date: 2020-07-21 21:48:59
@Description: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
@FilePath: \leetcode-googtech\#104. Maximum Depth of Binary Tree\Solution.py
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
        # lDepth = self.maxDepth(root.left)+1
        # rDepth = self.maxDepth(root.right)+1
        # return 0 if not root else lDepth if lDepth > rDepth else rDepth

        return 0 if not root else max(self.maxDepth(root.right),self.maxDepth(root.left)) + 1
