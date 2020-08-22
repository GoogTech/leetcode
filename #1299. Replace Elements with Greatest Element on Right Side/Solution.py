'''
Author: Goog Tech
Date: 2020-08-22 09:30:51
LastEditTime: 2020-08-22 09:31:23
Description: https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
FilePath: \leetcode-googtech\#1299. Replace Elements with Greatest Element on Right Side\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def replaceElements(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        # 判断数组是否为空
        if not arr: return 0
        # 初始化结果数组
        result = []
        # 从后往前遍历数组元素
        for i in range(len(arr) - 1):
            # 依次获取第i个下标元素之后的最大元素值,然后将其添加到结果数组中
            maxValue = max(arr[i+1:])
            result.append(maxValue)
        # 将-1作为结果数组的最后一个元素
        result.append(-1)
        # 返回结果数组
        return result
