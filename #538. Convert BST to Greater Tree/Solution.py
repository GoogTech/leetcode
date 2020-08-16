'''
Author: Goog Tech
Date: 2020-08-16 12:10:39
LastEditTime: 2020-08-16 12:30:38
Description: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
FilePath: \leetcode-googtech\#538. Convert BST to Greater Tree\Solution.py
WebSite: https://algorithm.show/
'''
#
# @lc app=leetcode.cn id=538 lang=python
#
# [538] 把二叉搜索树转换为累加树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def __init__(self):
        self.total = 0

    # 利用反序中序遍历解题,注: 二叉搜索树的左子树 < 根 <右子树
    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root is not None:
            # 遍历右子树
            self.convertBST(root.right)
            # 对遍历到的每个节点值进行累加,并将其结果赋值给当前节点的值
            self.total = self.total + root.val
            root.val = self.total
            # 遍历左子树
            self.convertBST(root.left)
        return root

# @lc code=end
