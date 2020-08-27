'''
Author: Goog Tech
Date: 2020-08-27 16:45:10
LastEditTime: 2020-08-27 16:46:44
Description: https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
FilePath: \leetcode-googtech\#442. Find All Duplicates in an Array\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 原地修改法
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # 初始化结果列表
        result = []
        # 遍历数组
        for i in nums:
            # 获取当前元素的绝对值
            num = abs(i)
            # 将当前元素 num 减一作为数组的下标值,获取 num 数组中对应的元素值,然后取其负
            nums[num - 1] *= -1
            # 若获取的元素值为正,则说明获取的元素出现了两次,进而将其存储到结果列表中
            if nums[num - 1] > 0:
                result.append(num)
        # 返回结果
        return result
