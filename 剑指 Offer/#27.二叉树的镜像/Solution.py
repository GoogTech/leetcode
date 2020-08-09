'''
Author: Goog Tech
Date: 2020-08-09 10:55:41
LastEditTime: 2020-08-09 10:56:48
Description: https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#27.二叉树的镜像\Solution.py
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def mirrorTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        # 判断根节点是否为空
        if not root: return root
        # 交换左右子树的孩子节点
        root.left, root.right = root.right, root.left
        # 递归根节点的左右子树
        self.mirrorTree(root.left)
        self.mirrorTree(root.right)
        # 返回结果
        return root
