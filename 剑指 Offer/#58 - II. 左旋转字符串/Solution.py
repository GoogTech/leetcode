'''
Author: Goog Tech
Date: 2020-08-04 10:18:18
LastEditTime: 2020-08-04 10:20:58
Description: https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#58 - II. 左旋转字符串\Solution.py
'''

class Solution(object):

    # 方法一: 字符串切片
    def reverseLeftWords(self, s, n):
        """
        :type s: str
        :type n: int
        :rtype: str
        """
        return s[n:] + s[:n]
    
    # 方法二: 列表遍历拼接
    def reverseLeftWords(self, s, n):
        result = []
        # 先将第n + 1位至末位的字符添加到result中
        for i in range(n, len(s)): result.append(s[i])
        # 再将首位至第n位的字符添加到result中
        for i in range(n): result.append(s[i])
        # 将result转换为字符串返回
        return ''.join(result)
