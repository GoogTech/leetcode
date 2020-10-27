'''
Author: Goog Tech
Date: 2020-10-27 14:18:56
LastEditTime: 2020-10-27 14:20:21
Description: https://leetcode-cn.com/problems/subsets/
FilePath: \leetcode-googtech\#78. Subsets\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    # 迭代
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = [[]]
        for i in nums: 
            result = result + [[i] + num for num in result]
        return result
