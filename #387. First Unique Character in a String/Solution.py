'''
Author: Goog Tech
Date: 2020-08-24 15:26:24
LastEditTime: 2020-08-24 15:26:45
Description: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
FilePath: \leetcode-googtech\#387. First Unique Character in a String\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 利用哈希表
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 计算每个字符出现的次数
        count = Counter(s)
        # 找到并返回首个满足出现次数为一的字符的下标值
        for index, char in enumerate(s):
            if count[char] == 1:
                return index
        # 无果
        return -1
