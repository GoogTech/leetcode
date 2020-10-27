'''
Author: Goog Tech
Date: 2020-10-27 15:42:46
LastEditTime: 2020-10-27 15:43:29
Description: https://leetcode-cn.com/problems/permutations/
FilePath: \leetcode-googtech\#46. Permutations\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        # 使用内置函数
        return list(itertools.permutations(nums))
