'''
Author: Goog Tech
Date: 2020-08-14 17:50:48
LastEditTime: 2020-08-14 17:59:45
Description: https://leetcode-cn.com/problems/move-zeroes/
FilePath: \leetcode-googtech\#283. Move Zeroes\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=283 lang=python
#
# [283] 移动零
#

# @lc code=start
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if not nums: return 0
        # 第一次遍历: 将数组中的非零元素赋值给nums[j]
        j = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[j] = nums[i]
                j += 1
        # 第二次遍历: 非零元素已移动完毕,最后将数组末尾元素赋值为0即可
        for i in range(j, len(nums)):
            nums[i] = 0
# @lc code=end
