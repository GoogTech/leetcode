'''
Author: Goog Tech
Date: 2020-08-21 09:06:35
LastEditTime: 2020-08-21 09:06:58
Description: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#03. 数组中重复的数字\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 利用哈希表
    def findRepeatNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        hashSet = set()
        for num in nums:
            if num in hashSet: return num
            hashSet.add(num)
        return -1
