'''
Author: Goog Tech
Date: 2020-08-29 17:48:18
LastEditTime: 2020-08-29 17:48:41
Description: https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
FilePath: \leetcode-googtech\#1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def isPrefixOfWord(self, sentence, searchWord):
        """
        :type sentence: str
        :type searchWord: str
        :rtype: int
        """
        # 切割字符串并将其转化为字符数组
        words = sentence.split(' ')
        # 遍历字符数组
        for i in range(len(words)):
            # 判断当前字符元素的长度是否大于检索词的长度,并且切割后的字符元素是否与检索词相同
            if len(words[i]) >= len(searchWord) and words[i][0 : len(searchWord)] == searchWord:
                # 若相同则返回句子 sentence 中该单词所对应的下标(下标从 1 开始)
                return i + 1
        # 无果
        return -1
