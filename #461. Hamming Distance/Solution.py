'''
Author: Goog Tech
Date: 2020-10-27 11:45:17
LastEditTime: 2020-10-27 11:46:46
Description: https://leetcode-cn.com/problems/hamming-distance/
FilePath: \leetcode-googtech\#461. Hamming Distance\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):

    # # 使用内置函数
    # def hammingDistance(self, x, y):
    #     """
    #     :type x: int
    #     :type y: int
    #     :rtype: int
    #     """
    #     return bin(x ^ y).count('1');

    # 异或运算 + 与运算判断 + 位移
    # 两个数的汉明距离就是这两个数进行异或运算,然后统计结果 x 的二进制中 1 的个数
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        result, count = x ^ y, 0
        while result:
            result &= (result - 1)
            count += 1
        return count
