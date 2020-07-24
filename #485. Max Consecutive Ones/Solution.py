'''
@Author: Goog Tech
@Date: 2020-07-24 16:51:47
@Description: https://leetcode-cn.com/problems/max-consecutive-ones/
@FilePath: \leetcode-googtech\#485. Max Consecutive Ones\Solution.py
'''
class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 初始化变量
        result = count = 0;
        # 遍历数组中的元素
        for num in nums:
            # 统计数组中连续相同元素的个数
            count = count+1 if num == 1 else 0;
            # 若count为0则表示数组中无连续相同的元素
            result = count if count > result else result
        # 返回结果
        return result
