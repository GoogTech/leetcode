'''
Author: Goog Tech
Date: 2020-08-29 14:34:23
LastEditTime: 2020-08-29 14:35:28
Description: https://leetcode-cn.com/problems/unique-morse-code-words/
FilePath: \leetcode-googtech\#804. Unique Morse Code Words\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        # 初始化 26 个英文字母对应摩尔斯密码表
        pwdStr = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        # 初始化用于存储单词翻译结果的 HashSet 集合
        result = set()
        # 遍历字符串数组
        for word in words:
            # 遍历当前单词中的所有字符,对照摩斯密码进行逐个翻译
            s = ""
            for c in word:
                # ord() 方法返回对应的 ASCII 数值,其中 ord(c) - ord(a) 的取值范围为 1 到 26
                s += pwdStr[ord(c) - 97]
            # 将单词翻译的结果添加到结果集合中
            result.add(s)
        # 返回结果集合中的已翻译的单词数(已去重)
        return len(result)
