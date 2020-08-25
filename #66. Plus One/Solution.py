'''
Author: Goog Tech
Date: 2020-08-25 11:46:58
LastEditTime: 2020-08-25 11:47:33
Description: https://leetcode-cn.com/problems/plus-one/
FilePath: \leetcode-googtech\#66. Plus One\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        # 从尾到头遍历数组
        for i in range(len(digits) - 1, -1, -1):
            # 若当前元素数值为 9 则用 0 替换
            if digits[i] == 9:
                digits[i] = 0
            # 反之尾部元素数值加一,然后退出循环并返回结果
            else:
                digits[i] = digits[i] + 1
                return digits
        # 针对一些特殊情况,例如遇到 99 之类的数字时,循环进位到最后导致首位为 0
        # 出现这种情况时需要手动将它进一位,然后返回结果
        if digits[0] == 0:
            digits.insert(0, 1)
        return digits
