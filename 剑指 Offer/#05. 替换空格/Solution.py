'''
Author: Goog Tech
Date: 2020-08-04 16:02:32
LastEditTime: 2020-08-04 16:03:10
Description: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#05. 替换空格\Solution.py
'''

class Solution(object):
    def replaceSpace(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        # 遍历列表 s 中的每一个字符
        for c in s:
            # 当 c 为空格时,将"%20"添加到result中
            if c == ' ':
                result.append("%20")
                # 当 c 不为空时,将'c'添加到result中
            else:
                result.append(c)
        # 将列表result转换为字符串并返回
        return ''.join(result)
