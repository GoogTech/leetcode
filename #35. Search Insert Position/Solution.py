'''
Author: Goog Tech
Date: 2020-08-04 12:32:42
LastEditTime: 2020-08-04 12:33:35
Description: https://leetcode-cn.com/problems/search-insert-position/
FilePath: \leetcode-googtech\#35. Search Insert Position\Solution.py
'''

class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for i in range(len(nums)): 
            if nums[i] >= target: return i
        return len(nums)
