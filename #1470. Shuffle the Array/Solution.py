'''
Author: Goog Tech
Date: 2020-08-15 21:57:56
LastEditTime: 2020-08-15 21:59:18
Description: https://leetcode-cn.com/problems/shuffle-the-array/
FilePath: \leetcode-googtech\#1470. Shuffle the Array\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        nums1, nums2, nums3 = nums[:n], nums[n:], []
        for i in range(n):
            nums3.append(nums1[i])
            nums3.append(nums2[i])
        return nums3
