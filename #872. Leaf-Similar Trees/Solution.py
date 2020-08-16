'''
Author: Goog Tech
Date: 2020-08-16 17:28:02
LastEditTime: 2020-08-16 17:39:45
Description: https://leetcode-cn.com/problems/leaf-similar-trees/
FilePath: \leetcode-googtech\#872. Leaf-Similar Trees\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=872 lang=python
#
# [872] 叶子相似的树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 先序遍历
    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        # 用于存储两个二叉树的叶子节点
        nums1, nums2 = [], []
        def leaf(root, nums):
            # 判断当前节点是否为空并且是否为叶子节点,若是则将其添加到nums中
            if root and not root.left and not root.right:
                nums.append(root.val)
            # 递归遍历当前节点的左右孩子节点
            if root.left: leaf(root.left, nums)
            if root.right: leaf(root.right, nums)
            # 返回叶子节点列表
            return nums
        # 判断两个二叉树的叶值序列是否相同
        return leaf(root1, nums1) == leaf(root2, nums2)
# @lc code=end
