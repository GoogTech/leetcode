'''
@Author: Goog Tech
@Date: 2020-07-25 10:45:35
@Description: https://leetcode-cn.com/problems/third-maximum-number/
@FilePath: \leetcode-googtech\#414. Third Maximum Number\Solution.py
'''
class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 初始化第一,第二以及第三大元素
        # -sys.maxsize = -9223372036854775807
        first = second = thrid = -sys.maxsize
        # 遍历数组,获取第一,第二以及第三大元素的值
        for num in nums:
            if num > first:
                thrid, second, first = second, first, num
            elif second < num < first:
                thrid, second = second, num
            elif thrid < num < second:
                thrid = num
        # 若无第三大元素则返回最大元素的值
        return first if thrid == -sys.maxsize else thrid
