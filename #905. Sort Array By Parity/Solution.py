'''
Author: Goog Tech
Date: 2020-08-16 11:39:20
LastEditTime: 2020-08-16 11:39:46
Description: https://leetcode-cn.com/problems/sort-array-by-parity/
FilePath: \leetcode-googtech\#905. Sort Array By Parity\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def sortArrayByParity(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        i = 0
        for j in range(len(A)):
            if A[j] % 2 == 0:
                A[i], A[j] = A[j], A[i]
                i += 1
        return A
