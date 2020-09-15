'''
Author: Goog Tech
Date: 2020-09-15 16:12:13
LastEditTime: 2020-09-15 16:12:39
Description: https://leetcode-cn.com/problems/minimum-number-of-vertices-to-reach-all-nodes/
FilePath: \leetcode-googtech\#1557. Minimum Number of Vertices to Reach All Nodes\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    # 解题思路 : 遍历所有的边,使用集合存储所有有向边的终点,
    # 集合中的所有节点即为入度不为零的节点,剩下的所有节点即为入度为零,即没有前驱的节点.
    def findSmallestSetOfVertices(self, n, edges):
        """
        :type n: int
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        endingSet = set(y for x, y in edges)
        return [i for i in range(n) if i not in endingSet]
