'''
Author: Goog Tech
Date: 2020-09-15 15:07:34
LastEditTime: 2020-09-15 15:08:56
Description: https://leetcode-cn.com/problems/range-sum-query-immutable/
FilePath: \leetcode-googtech\#303. Range Sum Query - Immutable\Solution.py
Reference: https://leetcode-cn.com/problems/range-sum-query-immutable/solution/marveljian-dan-de-xue-xi-bi-ji-303-by-tyanyonecanc/
WebSite: https://algorithm.show/
'''

class NumArray(object):

    # DP : 动态规划
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        if not nums: return
        self.result = [0] * len(nums)
        self.result[0] = nums[0]
        for i in range(1, len(nums)):
            # result[i] 的值为 nums[0] 到 nums[i] 的所有值之和
            self.result[i] = self.result[i - 1] + nums[i]

    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        if i == 0: return self.result[j]
        else: return self.result[j] - self.result[i - 1]

# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(i,j)
