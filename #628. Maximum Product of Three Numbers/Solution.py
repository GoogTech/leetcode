'''
@Author: Goog Tech
@Date: 2020-07-25 12:27:03
@Description: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
@FilePath: \leetcode-googtech\#628. Maximum Product of Three Numbers\Solution.py
'''
class Solution(object):
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 初始化第一、第二、第三大元素以及第一、第二小元素
        # -sys.maxsize = -9223372036854775807
        firstMax = secondMax = thirdMax = -sys.maxsize
        firstMin = secondMin = sys.maxsize
        # 遍历数组
        for num in nums:
            # 获取第一,第二以及第三大元素
            if num > firstMax:
                thirdMax, secondMax, firstMax = secondMax, firstMax, num
            elif num > secondMax:
                thirdMax, secondMax = secondMax, num
            elif num > thirdMax:
                thirdMax = num
            # 获取第一,第二小元素
            if num < firstMin:
                secondMin, firstMin = firstMin, num
            elif num < secondMin:
                secondMin = num
        # 有正有负有零: 最大3个数相乘 / 最小2个数(负负得正)与最大的1个数相乘
        return max(firstMax * secondMax * thirdMax,
                   firstMax * firstMin * secondMin)
