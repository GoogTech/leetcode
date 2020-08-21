'''
Author: Goog Tech
Date: 2020-08-21 18:35:45
LastEditTime: 2020-08-21 18:36:21
Description: https://leetcode-cn.com/problems/reverse-only-letters/
FilePath: \leetcode-googtech\#917. Reverse Only Letters\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def reverseOnlyLetters(self, S):
        """
        :type S: str
        :rtype: str
        """
        # 将字符串转换为列表数组
        S = list(S)
        # 初始化双指针
        front, end = 0, len(S) - 1
        # 通过移动双指针循环遍历数组元素
        while front < end:
            # 遇到非字母时,头指针向后移动,尾指针向前移动
            if not S[front].isalpha():
                front += 1
            elif not S[end].isalpha():
                end -= 1
            # 当头尾指针所指元素都为字母时,交换元素位置,然后继续移动头尾指针
            else:
                S[front], S[end] = S[end], S[front]
                front += 1
                end -= 1
        # 将列表数组转化为字符串并返回
        return ''.join(S)
