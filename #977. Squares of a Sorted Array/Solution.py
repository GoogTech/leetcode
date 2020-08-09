'''
Author: Goog Tech
Date: 2020-08-09 10:29:28
LastEditTime: 2020-08-09 10:30:23
Description: https://leetcode-cn.com/problems/squares-of-a-sorted-array/
FilePath: \leetcode-googtech\#977. Squares of a Sorted Array\Solution.py
'''

class Solution(object):
    def sortedSquares(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        for i in range(len(A)):
            A[i] = A[i]*A[i]
        return sorted(A)
