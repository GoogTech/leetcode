'''
Author: Goog Tech
Date: 2020-08-16 16:58:35
LastEditTime: 2020-08-16 17:10:50
Description: https://leetcode-cn.com/problems/binary-tree-paths/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\257.二叉树的所有路径.py
WebSite: https://algorithm.show/
'''
#
# @lc app=leetcode.cn id=257 lang=python
#
# [257] 二叉树的所有路径
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def binaryTreePaths(self, root):
        """
        :type root: TreeNode
        :rtype: List[str]
        """
        # 判断当前节点是否为空
        if not root: 
            return []
        # 判断当前节点是否为叶子节点
        if not root.left and not root.right: 
            return [str(root.val)]
        # 初始化用于存储根节点到左右叶子节点路径的列表
        paths = []
        # 递归添加当前节点到叶子节点的路径
        if root.left:
            for i in self.binaryTreePaths(root.left):
                paths.append(str(root.val) + '->' + i)
        if root.right:
            for i in self.binaryTreePaths(root.right):
                paths.append(str(root.val) + '->' + i)
        # 返回结果
        return paths
# @lc code=end
