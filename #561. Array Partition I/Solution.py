'''
Author: Goog Tech
Date: 2020-08-16 09:49:58
LastEditTime: 2020-08-16 09:51:47
Description: https://leetcode-cn.com/problems/array-partition-i/
FilePath: \leetcode-googtech\#561. Array Partition I\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 其实就是把从a1到an数组下标为奇数的数都加起来
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return sum(sorted(nums)[::2]) # seq[start:end:step]
