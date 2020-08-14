'''
Author: Goog Tech
Date: 2020-08-14 20:22:02
LastEditTime: 2020-08-14 20:52:13
Description: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
FilePath: \leetcode-googtech\#108. Convert Sorted Array to Binary Search Tree\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=108 lang=python
#
# [108] 将有序数组转换为二叉搜索树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        # 判断数组是否为空
        if not nums: return None
        # 获取数组中间元素的下标值,并将该元素作为二叉树的根节点
        midNodeIndex = len(nums) // 2
        root = TreeNode(nums[midNodeIndex])
        # 左侧数组作为左子树,同理右侧数组作为右子树
        root.left = self.sortedArrayToBST(nums[:midNodeIndex])
        root.right = self.sortedArrayToBST(nums[midNodeIndex + 1:])
        # 返回结果
        return root
# @lc code=end
