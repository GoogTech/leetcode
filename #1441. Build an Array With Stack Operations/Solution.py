'''
Author: Goog Tech
Date: 2020-09-01 20:10:17
LastEditTime: 2020-09-01 20:10:39
Description: https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
FilePath: \leetcode-googtech\#1441. Build an Array With Stack Operations\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def buildArray(self, target, n):
        """
        :type target: List[int]
        :type n: int
        :rtype: List[str]
        """
        # 初始化结果列表
        result = []
        # 遍历 1 到 n 之间所有的数值
        for num in range(1, target[-1] + 1):
            # 将 Push 字符存储到结果列表中
            result.append('Push')
            # 若当前数值 num 在数组 target 不存在,则说明数组中缺失数值 num
            if num not in target:
                # 进而将 Pop 字符添加到结果列表中
                result.append('Pop')
        # 返回结果列表
        return result
