'''
Author: Goog Tech
Date: 2020-09-09 19:03:22
LastEditTime: 2020-09-09 19:05:54
Description: https://leetcode-cn.com/problems/sort-array-by-parity-ii/
FilePath: \leetcode-googtech\#922. Sort Array By Parity II\Solution.py
WebSite: https://algorithm.show/
'''
class Solution(object):
    # i 用于寻找偶数,j 用于寻找奇数
    # 解题思路: 把奇数部分作为暂存区,不断增加指向奇数部分的指针,直到找到一个偶数,然后交换指针i, j所指的值
    def sortArrayByParityII(self, A):
        """
        :type A: List[int]
        :rtype: List[int]
        """
        j = 1
        # 遍历数组中下标为偶数的元素
        for i in range(0, len(A), 2):
            # 判断当前偶数下标的元素是否为奇数
            if A[i] % 2:
                # 判断当前奇数下标的元素是否为奇数,即寻找偶数下标 j
                while A[j] % 2:
                    j += 2
                # 交换当前奇偶元素
                A[i], A[j] = A[j], A[i]
        # 返回结果数组
        return A
