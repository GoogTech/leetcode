'''
Author: Goog Tech
Date: 2020-08-09 07:28:12
LastEditTime: 2020-08-09 07:34:54
Description: https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
FilePath: \leetcode-googtech\#557. Reverse Words in a String III\Solution.py
'''

class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        # 将字符串分割成单词列表,然后把每个单词反转切片
        return " ".join(word[::-1] for word in s.split(" "))
