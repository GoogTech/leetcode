'''
Author: Goog Tech
Date: 2020-09-15 11:16:47
LastEditTime: 2020-09-15 11:17:16
Description: https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
FilePath: \leetcode-googtech\#515. Find Largest Value in Each Tree Row\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution(object):
    # BFS : 深度优先遍历
    def largestValues(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # 判断根节点是否为空
        if not root: return []
        # 初始化结果列表
        result = []
        # 初始化模拟队列
        queue = [root] 
        # 循环遍历队列
        while queue:
            # 初始化最小节点值
            maxValue = float('-inf')
            # 遍历队列元素
            for _ in range(len(queue)):
                # 将队列中第一元素出队
                node = queue.pop(0)
                # 通过逐一比较,获取二叉树当前层中最大节点值
                maxValue = max(maxValue, node.val)
                # 将当前出队节点的左右孩子节点入队
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            # 将当前层中最大节点值添加到结果列表中
            result.append(maxValue)
        # 返回结果
        return result
