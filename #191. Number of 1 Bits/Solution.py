'''
Author: Goog Tech
Date: 2020-08-16 10:07:58
LastEditTime: 2020-08-16 10:08:49
Description: https://leetcode-cn.com/problems/number-of-1-bits/
FilePath: \leetcode-googtech\#191. Number of 1 Bits\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        # bin() 返回一个整数 int 或者长整数 long int 的二进制表示
        for i in str(bin(n)):
            if i == '1': count += 1
        return count
