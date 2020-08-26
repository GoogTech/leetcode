'''
Author: Goog Tech
Date: 2020-08-26 13:00:43
LastEditTime: 2020-08-26 13:05:01
Description: https://leetcode-cn.com/problems/set-mismatch/
FilePath: \leetcode-googtech\#645. Set Mismatch\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def findErrorNums(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # 初始化结果列表并对 nums 进行排序处理
        result, nums = [], sorted(nums)
        # 从头到尾遍历数组
        for i in range(len(nums) - 1):
            # 若相邻元素相同则将其添加到结果列表中,然后结束遍历
            if nums[i] == nums[i + 1]:
                result.append(nums[i])
                break
        # 从索引值一开始从头到尾遍历数组
        for i in range(1, len(nums) + 1):
            # 若当前索引值不在数组 nums 中则将其添加到结果列表中,然后结束遍历
            if i not in nums:
                result.append(i)
                break
        # 返回结果
        return result
