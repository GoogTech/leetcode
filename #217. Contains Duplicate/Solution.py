'''
Author: Goog Tech
Date: 2020-08-21 20:36:36
LastEditTime: 2020-08-21 20:37:02
Description: https://leetcode-cn.com/problems/contains-duplicate/
FilePath: \leetcode-googtech\#217. Contains Duplicate\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 利用 HashSet 集合判断数组中是否还有重复元素
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        return len(set(nums)) < len(nums)
