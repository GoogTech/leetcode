'''
Author: Goog Tech
Date: 2020-08-04 16:43:28
LastEditTime: 2020-08-04 16:46:33
Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#32 - I. 从上到下打印二叉树\Solution.py
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # 判断头节点是否为空
        if not root: return []
        # 初始化结果列表及辅助队列
        result, queue = [], [root]
        # 循环弹出队首元素,将其值存储到result并将其孩子节点入队
        while queue:
            currentNode = queue.pop(0)
            result.append(currentNode.val)
            if currentNode.left:
                queue.append(currentNode.left)
            if currentNode.right:
                queue.append(currentNode.right)
        # 返回结果列表
        return result
