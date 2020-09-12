'''
Author: Goog Tech
Date: 2020-09-12 10:47:16
LastEditTime: 2020-09-12 10:50:20
Description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
FilePath: \leetcode-googtech\107. Binary Tree Level Order Traversal II\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    # 广度优先遍历( BFS )
    def levelOrderBottom(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 判断根节点是否为空
        if not root: return []
        # 初始化结果列表及辅助队列
        result, queue = [], [root]
        # 判断当前辅助队列是否为空
        while queue:
            # 初始化用于存储当前层节点的列表
            oneLevel = []
            # 循环遍历辅助队列中存储的上层节点
            for _ in range(len(queue)):
                # 将存储在队列中的上层节点逐个弹出,并将其存储到临时列表中
                node = queue.pop(0)
                oneLevel.append(node.val)
                # 若当前弹出节点的左右孩子节点不为空,则将其孩子节点继续添加到队列中
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            # 将存储上一层节点的临时列表添加到结果列表中
            result.append(oneLevel)
        # 反转结果列表,即返回其节点值自底向上的层次遍历
        return result[::-1]
