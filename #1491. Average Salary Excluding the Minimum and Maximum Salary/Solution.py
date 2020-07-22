'''
@Author: Goog Tech
@Date: 2020-07-22 17:10:01
@Description: https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
@FilePath: \leetcode-googtech\#1491. Average Salary Excluding the Minimum and Maximum Salary\Solution.py
'''
class Solution(object):
    def average(self, salary):
        """
        :type salary: List[int]
        :rtype: float
        """
        maxValue = max(salary)
        minValue = min(salary)
        total = sum(salary) - maxValue - minValue
        return total / (len(salary)-2.0)
