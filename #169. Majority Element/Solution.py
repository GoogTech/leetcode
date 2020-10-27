'''
Author: Goog Tech
Date: 2020-10-27 14:30:25
LastEditTime: 2020-10-27 14:31:13
Description: https://leetcode-cn.com/problems/majority-element/
FilePath: \leetcode-googtech\#169. Majority Element\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    # 摩尔投票法
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result, count = 0, 0
        for num in nums:
            if count == 0:
                result = num
            if num != result:
                count -= 1
            else:
                count += 1
        return result
