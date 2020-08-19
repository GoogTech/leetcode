'''
Author: Goog Tech
Date: 2020-08-19 11:49:51
LastEditTime: 2020-08-19 11:53:57
Description: https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#28.对称的二叉树\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 递归法
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        # 判断头节点是否为空
        if not root: return True
        # 递归遍历根节点的左右子树的孩子节点
        def dfs(left, right):
            # 若左右子树的两孩子节点都为空,则对称
            if not left and not right: return True
            # 若左右子树的两孩子节点其中有一个为空或这两节点的值不相同,则不对称
            if not left or not right or left.val != right.val: return False
            # 继续递归比较左右子树的孩子节点
            return dfs(left.left, right.right) and dfs(left.right, right.left)
        # 传入左右子树的根节点
        return dfs(root.left, root.right)
