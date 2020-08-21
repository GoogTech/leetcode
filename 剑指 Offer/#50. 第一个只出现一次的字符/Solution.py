'''
Author: Goog Tech
Date: 2020-08-21 10:34:28
LastEditTime: 2020-08-21 10:35:09
Description: https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#50. 第一个只出现一次的字符\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 哈希表
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: str
        """
        dic = {}
        # Python 代码中的 not c in dic 整体为一个布尔值
        # c in dic 为判断字典中是否含有键 c 
        for c in s:
            dic[c] = not c in dic
        for c in s:
            if dic[c]: return c
        return ' '
