'''
Author: Goog Tech
Date: 2020-08-16 14:45:27
LastEditTime: 2020-08-16 14:52:02
Description: https://leetcode-cn.com/problems/single-number-ii/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\137.只出现一次的数字-ii.py
WebSite: https://algorithm.show/
'''
#
# @lc app=leetcode.cn id=137 lang=python
#
# [137] 只出现一次的数字 II
#

# @lc code=start
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 将数组中的元素作为key,其出现的次数作为value存储到 hashMap 中
        hashMap = Counter(nums)
        # 遍历键值对,若键对应的值为1则返回改键,即结果数值
        for k in hashMap.keys():
            if hashMap[k] == 1: return k
        # 无果
        return -1
# @lc code=end
