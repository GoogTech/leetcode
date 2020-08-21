'''
Author: Goog Tech
Date: 2020-08-21 21:03:52
LastEditTime: 2020-08-21 21:04:10
Description: https://leetcode-cn.com/problems/single-number-iii/
FilePath: \leetcode-googtech\#260. Single Number III\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 哈希表法
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Counter() 用于统计字符出现的个数或列表内出现的元素次数
        hashMap = Counter(nums)
        return [x for x in hashMap if hashMap[x] == 1]
