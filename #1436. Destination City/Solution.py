'''
Author: Goog Tech
Date: 2020-08-29 11:53:45
LastEditTime: 2020-08-29 11:54:09
Description: https://leetcode-cn.com/problems/destination-city/
FilePath: \leetcode-googtech\#1436. Destination City\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def destCity(self, paths):
        """
        :type paths: List[List[str]]
        :rtype: str
        """
        # 初始化用于存储起点与终点名称的列表
        start, end = [], []
        # 遍历旅行线路集合,分别将起点与终点名存储到列表中
        for path in paths:
            start.append(path[0])
            end.append(path[1])
        # 遍历终点名称列表
        for des in end:
            # 逐个判断当前终点名是否被包含在起点名称列表中
            if des not in start:
                # 若不包含则说明该点就是旅行终点站
                return des
