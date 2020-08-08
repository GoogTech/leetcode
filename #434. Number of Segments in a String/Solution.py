'''
Author: Goog Tech
Date: 2020-08-09 07:04:25
LastEditTime: 2020-08-09 07:06:02
Description: https://leetcode-cn.com/problems/number-of-segments-in-a-string/
FilePath: \leetcode-googtech\#434. Number of Segments in a String\Solution.py
'''

class Solution(object):
    def countSegments(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = 0
        lastChar = ' '
        # 循环遍历数组元素
        for c in s:
            # 统计字符串中的空格数
            if c != ' ' and lastChar == ' ':
                length += 1
            lastChar = c
        return length
