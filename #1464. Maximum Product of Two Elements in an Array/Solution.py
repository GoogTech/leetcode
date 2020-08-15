'''
Author: Goog Tech
Date: 2020-08-15 14:44:38
LastEditTime: 2020-08-15 14:45:11
Description: https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
FilePath: \leetcode-googtech\#1464. Maximum Product of Two Elements in an Array\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        return (nums[len(nums) - 1] - 1) * (nums[len(nums) - 2] - 1)
