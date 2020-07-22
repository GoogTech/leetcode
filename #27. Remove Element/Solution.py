'''
@Author: Goog Tech
@Date: 2020-07-22 21:58:29
@Description: https://leetcode-cn.com/problems/remove-element/
@FilePath: \leetcode-googtech\#27. Remove Element\Solution.py
'''
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        while val in nums:
            nums.remove(val)
        return len(nums)
