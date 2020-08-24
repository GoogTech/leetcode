'''
Author: Goog Tech
Date: 2020-08-24 19:18:46
LastEditTime: 2020-08-24 19:20:16
Description: https://leetcode-cn.com/problems/add-strings/
FilePath: \leetcode-googtech\#415. Add Strings\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        # 初始化结果列表
        result = []
        # 初始化字符串尾指针及进位值
        i, j, carry = len(num1) - 1, len(num2) - 1, 0
        # 循环遍历字符串
        while i >= 0 or j >= 0 or carry:
            # 移动字符串尾指针,并累加元素值,其中 ord() 方法的返回值是对应的十进制整数
            if i >= 0: carry += ord(num1[i]) - ord('0')
            if j >= 0: carry += ord(num2[j]) - ord('0')
            # 取个位数值并将其存储到 result 列表中
            result.append(str(carry % 10))
            # 舍去个位数值进而获取进位值
            carry = carry // 10
            # 向前移动字符串尾指针
            i, j = i - 1, j -1
        # 将结果列表反转后转换为字符串,然后返回
        return ''.join(result[::-1])
