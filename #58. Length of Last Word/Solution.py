'''
Author: Goog Tech
Date: 2020-08-24 14:34:07
LastEditTime: 2020-08-24 14:34:36
Description: https://leetcode-cn.com/problems/length-of-last-word/
FilePath: \leetcode-googtech\#58. Length of Last Word\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 初始化字符串尾部指针及结果值
        result, tail = 0, len(s) - 1
        # 首先删除字符串末尾空格
        while tail >= 0 and s[tail] == ' ':
            tail -= 1
        # 计数最后一个单词的长度
        while tail >= 0 and s[tail] != ' ':
            result += 1
            tail -= 1
        # 返回结果
        return result
