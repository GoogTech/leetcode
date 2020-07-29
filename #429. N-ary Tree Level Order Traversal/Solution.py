'''
@Author: Goog Tech
@Date: 2020-07-29 10:31:43
@LastEditTime: 2020-07-29 10:56:49
@Description: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\429.n叉树的层序遍历.py
'''

#
# @lc app=leetcode.cn id=429 lang=python
#
# [429] N叉树的层序遍历
#

# @lc code=start
"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):
    # BFS: 利用队列实现广度优先搜索
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        # 若头节点不为空则将其压入辅助队列中
        if not root: return []
        # 初始化辅助队列和结果列表
        result, queue = [], [root]
        # 循环遍历辅助队列
        while queue:
            # 初始化辅助节点,用于将当前出队节点存储到结果列表中
            temp = []
            # 将辅助队列中的节点依次出队,并将其孩子节点依次入队
            for i in range(len(queue)):
                node = queue.pop(0)
                if node is not None:
                    temp.append(node.val)
                    for children in node.children:
                        queue.append(children)
            # 存储辅助队列中当前出队的节点
            result.append(temp)
        # 返回结果列表
        return result 
# @lc code=end
 