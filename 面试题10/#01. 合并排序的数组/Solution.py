'''
Author: Goog Tech
Date: 2020-08-30 14:51:10
LastEditTime: 2020-08-30 14:51:57
Description: https://leetcode-cn.com/problems/sorted-merge-lcci/
FilePath: \leetcode-googtech\面试题10\#01. 合并排序的数组\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def merge(self, A, m, B, n):
        """
        :type A: List[int]
        :type m: int
        :type B: List[int]
        :type n: int
        :rtype: None Do not return anything, modify A in-place instead.
        """
        # 首先通过遍历将 B 数组中的元素添加到 A 数组中,然后对 A 数组中的元素进行排序
        for i in range(n): A[m + i] = B[i]
        A.sort()
