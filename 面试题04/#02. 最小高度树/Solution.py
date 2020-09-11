'''
Author: Goog Tech
Date: 2020-09-11 08:40:19
LastEditTime: 2020-09-11 08:41:44
Description: https://leetcode-cn.com/problems/minimum-height-tree-lcci/
FilePath: \leetcode-googtech\面试题04\#02. 最小高度树\Solution.py
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
    # 将数组中间的元素作为根节点,然后以中间为分界点分别对左边及右边的子数组进行递归,
    # 最后返回的是左右子树的根节点,然后令其等于 root.left 及 root.right 即可.
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        if not nums: return None
        mid = len(nums) // 2
        root = TreeNode(nums[mid])
        root.left = self.sortedArrayToBST(nums[:mid])
        root.right = self.sortedArrayToBST(nums[mid + 1:])
        return root
