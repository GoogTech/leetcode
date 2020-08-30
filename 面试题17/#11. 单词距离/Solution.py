'''
Author: Goog Tech
Date: 2020-08-30 22:45:41
LastEditTime: 2020-08-30 22:46:02
Description: https://leetcode-cn.com/problems/find-closest-lcci/
FilePath: \leetcode-googtech\面试题17\#11. 单词距离\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 双指针法
    def findClosest(self, words, word1, word2):
        """
        :type words: List[str]
        :type word1: str
        :type word2: str
        :rtype: int
        """
        # 初始化双指针以及最短距离值
        indexWorld1, indexWorld2, minDistance = -1, -1, 0
        # 逐个遍历字符串数组中的单词
        for i in range(len(words)):
            # 若当前单词与 word1 / word2 相同,则将其下标值赋值给 indexWord1 / indexWord2
            if words[i] == word1: indexWorld1 = i
            if words[i] == word2: indexWorld2 = i
            # 判断双指针是否发生了变化
            if indexWorld1 != -1 and indexWorld2 != -1:
                # 若最短距离值仍未零,则取双指针差值后的绝对值,并将其赋值给 minDistance
                if minDistance == 0: 
                    minDistance = abs(indexWorld1 - indexWorld2)
                # 若最短距离不为零,则取双指针差值后的绝对值,并将其与上个 minDistance 比较,取其最小值 
                minDistance = min(minDistance, abs(indexWorld1 - indexWorld2))
        # 返回最小距离值
        return minDistance
