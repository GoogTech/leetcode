'''
Author: Goog Tech
Date: 2020-08-21 15:16:04
LastEditTime: 2020-08-21 15:16:30
Description: https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
FilePath: \leetcode-googtech\#1295. Find Numbers with Even Number of Digits\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):

    # 先将整型数组中的元素逐个转换为字符串,然后计算每个字符串的长度即可
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for num in nums:
            if len(str(num)) % 2 == 0:
                count += 1
        return count
