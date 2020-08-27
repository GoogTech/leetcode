'''
Author: Goog Tech
Date: 2020-08-27 18:08:53
LastEditTime: 2020-08-27 18:09:33
Description: https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
FilePath: \leetcode-googtech\#453. Minimum Moves to Equal Array Elements\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 解题思路: 每次 n - 1 个数同时加一等同于每次有一个数自身减一,
    # 进而每个元素减去最小值的和就是答案,最后数组中的元素都为最小值
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        sum = 0
        minNum = min(nums)
        for i in nums:
            sum += i - minNum
        return sum
