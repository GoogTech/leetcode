'''
Author: Goog Tech
Date: 2020-08-04 06:45:56
LastEditTime: 2020-08-04 07:20:08
Description: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.py
'''

#
# @lc app=leetcode.cn id=167 lang=python
#
# [167] 两数之和 II - 输入有序数组
#

# @lc code=start
class Solution(object):
    # 双指针法
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        # 初始化头尾指针
        head, tail = 0, len(numbers) - 1
        # 通过移动头或尾部指针来遍历数组中的元素
        # left与right的数字之和小于所给的target,则left = left + 1,相反则right = right -1,然后继续循环
        while head < tail:
            # 判断当前头尾指针所指的元素之和是否等于target
            total = numbers[head] + numbers[tail]
            if total == target: 
                return [head + 1, tail + 1]
            elif total < target: 
                head = head + 1 # 头指针有移
            else: 
                tail = tail - 1 # 头指针左移
        # 无解
        return [-1, -1]
        
# @lc code=end
