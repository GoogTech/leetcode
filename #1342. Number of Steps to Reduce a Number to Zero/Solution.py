'''
Author: Goog Tech
Date: 2020-08-21 15:00:28
LastEditTime: 2020-08-21 15:00:57
Description: https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
FilePath: \leetcode-googtech\#1342. Number of Steps to Reduce a Number to Zero\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    def numberOfSteps (self, num):
        """
        :type num: int
        :rtype: int
        """
        steps = 0
        while num > 0:
            num = num / 2 if num % 2 == 0 else num - 1
            steps += 1
        return steps
