'''
Author: Goog Tech
Date: 2020-08-18 15:31:49
LastEditTime: 2020-08-18 15:32:11
Description: https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#15. 二进制中1的个数\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        # bin() 函数返回一个 int 或者长整型 long int 的二进制表示
        for i in str(bin(n)):
            if i == '1': count += 1
        return count
