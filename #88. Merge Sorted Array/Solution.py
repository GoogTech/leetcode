'''
Author: Goog Tech
Date: 2020-08-24 08:49:22
LastEditTime: 2020-08-24 09:03:04
Description: https://leetcode-cn.com/problems/merge-sorted-array/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\88.合并两个有序数组.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=88 lang=python
#
# [88] 合并两个有序数组
#

# @lc code=start
class Solution(object):

    # 先合并后排序: 但这种方法没有利用两个数组本身已经有序这一点
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        # nums1[:] 等价于 nums1[0 : len(nums1)] 相当于取 nums1 对应的对象的一个视图
        nums1[0 : len(nums1)] = sorted(nums1[:m] + nums2[:n])
# @lc code=end
