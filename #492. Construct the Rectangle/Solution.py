'''
Author: Goog Tech
Date: 2020-08-28 06:58:52
LastEditTime: 2020-08-28 06:59:29
Description: https://leetcode-cn.com/problems/construct-the-rectangle/
FilePath: \leetcode-googtech\#492. Construct the Rectangle\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 双指针法
    def constructRectangle(self, area):
        """
        :type area: int
        :rtype: List[int]
        """
        # 取面积 area 的平方根
        sqrt = math.sqrt(area)
        # 将 sqrt 由浮点型转换为整型
        intSqrt = int(sqrt)
        # 初始化双指针,即长度与宽度
        length, width = intSqrt, intSqrt
        # 通过移动双指针实现循环遍历
        while width <= length:
            # 若当前长度和宽度的乘积等于给定面积,则返回结果值
            if length * width == area:
                return [length, width]
            # 若小于则移动 length 指针,即增大长度值
            elif length * width < area:
                length += 1
            # 反之则减小宽度值(要求 L >= W)
            else:
                width -= 1
        # 无果
        return [0, 0]
