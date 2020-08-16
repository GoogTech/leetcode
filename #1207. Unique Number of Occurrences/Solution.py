'''
Author: Goog Tech
Date: 2020-08-16 10:33:02
LastEditTime: 2020-08-16 10:38:35
Description: https://leetcode-cn.com/problems/unique-number-of-occurrences/
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\1207.独一无二的出现次数.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1207 lang=python
#
# [1207] 独一无二的出现次数
#

# @lc code=start
class Solution(object):
    def uniqueOccurrences(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        """
        # 统计每个数值出现的次数
        eleCounts = collections.Counter(arr)
        # 将统计结果去重,然后与原统计结果相比较
        return len(set(eleCounts.values())) == len(eleCounts)
        
# @lc code=end
