'''
Author: Goog Tech
Date: 2020-08-15 20:59:46
LastEditTime: 2020-08-15 21:15:09
Description: https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
FilePath: \leetcode-googtech\#1281. Subtract the Product and Sum of Digits of an Integer\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1281 lang=python
#
# [1281] 整数的各位积和之差
#

# @lc code=start
class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        # 先将 n 转换为字符串类型,然后再其转换为列表类型并赋值给alist
        alist = list(str(n))
        # 初始化乘积与和的值
        p, s = 1, 0
        # 遍历列表元素,将元素逐个转换为整型并求出乘积和与相加和
        for element in alist:
            p *= int(element)
            s += int(element)
        # 返回结果
        return p - s
# @lc code=end
