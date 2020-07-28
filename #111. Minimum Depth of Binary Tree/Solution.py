'''
@Author: Goog Tech
@Date: 2020-07-28 22:53:59
@Description: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\111.二叉树的最小深度.py
@Reference: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/solution/li-jie-zhe-dao-ti-de-jie-shu-tiao-jian-by-user7208/
'''

#
# @lc app=leetcode.cn id=111 lang=python
#
# [111] 二叉树的最小深度
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    '''
    递归法，解题思路如下: 
    叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
    1. 当 root 节点左右孩子都为空时，返回 1
    2. 当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
    3. 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
    '''
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root: return 0
        lDepth, rDepth = self.minDepth(root.left), self.minDepth(root.right)
        # 若左孩子或有孩子为空(lDepth or rDepth is zero.),则可直接返回: lDepth + rDepth + 1
        # 若左右孩子都不为空则返回较小的那个孩子的深度值
        return lDepth + rDepth + 1 if root.left is None or root.right is None else min(lDepth, rDepth) + 1 
# @lc code=end
