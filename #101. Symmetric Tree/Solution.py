'''
@Author: Goog Tech
@Date: 2020-07-28 23:12:04
@Description: https://leetcode-cn.com/problems/symmetric-tree/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\101.对称二叉树.py
'''
#
# @lc app=leetcode.cn id=101 lang=python
#
# [101] 对称二叉树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归法
    # 有个超大的坑啊: 记得首先判断 if not left and not right 
    # 而不是 if not left or not right,不然无论什么结果都会一直返回 False
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root: 
            return True
        def dfs(left, right):
            # 若左右子树中的两节点都非空,则对称
            if not left and not right: return True
            # 若左右子树中的两节点其有一个为空,则不对称
            if not left or not right: return False
            # 若左右子树中的两节点不相同,则不对称
            if left.val != right.val: return False
            # 继续递归比较左节点的左孩子和右节点的右孩子
            return dfs(left.left, right.right) and dfs(left.right, right.left)
        # 传入左右子树的根节点
        return dfs(root.left, root.right)
# @lc code=end
