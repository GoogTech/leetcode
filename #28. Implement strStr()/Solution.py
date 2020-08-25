'''
Author: Goog Tech
Date: 2020-08-25 16:42:12
LastEditTime: 2020-08-25 16:42:51
Description: https://leetcode-cn.com/problems/implement-strstr/
FilePath: \leetcode-googtech\#28. Implement strStr()\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 😅理应使用 KMP 算法,这里简单使用 API 啦
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        # 判断 needle 字符串是否为空
        if needle == "": return 0
        # 分别获取两个字符串的长度
        haystackLength, needleLength = len(haystack), len(needle)
        # 遍历字符串,其中 len(haystack) - len(needle) 是为了防止 haystack[i : i + needleLength] 下标越界
        for i in range(0, haystackLength - needleLength + 1):
            # 判断 needle 字符串是否与下标范围为 i 到 i + needleLength 所分割的字符串相等
            if haystack[i : i + needleLength] == needle:
                # 若相等则返回 needle 字符串出现的第一个位置的下标值
                return i
        # 无果
        return -1
