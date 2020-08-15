'''
Author: Goog Tech
Date: 2020-08-15 08:45:00
LastEditTime: 2020-08-15 09:01:59
Description: https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
FilePath: \leetcode-googtech\#1502. Can Make Arithmetic Progression From Sequence\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1502 lang=python
#
# [1502] 判断能否形成等差数列
#

# @lc code=start
class Solution(object):

    # 对原序列排序后,若其元素满足 An x 2 = An-1 + An+1 则判定其为等差数列
    def canMakeArithmeticProgression(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        arr.sort()
        for i in range(1, len(arr) - 1):
            if arr[i] * 2 != arr[i - 1] + arr[i + 1]:
                return False
        return True
# @lc code=end
