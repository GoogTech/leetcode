'''
Author: Goog Tech
Date: 2020-08-14 13:24:04
LastEditTime: 2020-08-14 13:54:33
Description: https://leetcode-cn.com/problems/shuffle-string/ 
FilePath: \leetcode-googtech\#1528. Shuffle String\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=5472 lang=python
#
# [5472] 重新排列字符串
#

# @lc code=start
class Solution(object):
    def restoreString(self, s, indices):
        """
        :type s: str
        :type indices: List[int]
        :rtype: str
        """
        # 创建一个长度为len(s)的数组
        result = ["" for i in range(len(s))]
        # 循环填充数组,其中indices[i]作为索引,s[i]作为索引值
        for i in range(len(s)):
            result[indices[i]] = s[i]
        # 将数组转换为字符串并返回
        return "".join(result)

# @lc code=end
