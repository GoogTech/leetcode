'''
Author: Goog Tech
Date: 2020-09-23 21:53:15
LastEditTime: 2020-09-23 21:54:24
Description: https://leetcode-cn.com/problems/count-good-nodes-in-binary-tree/
FilePath: \leetcode-googtech\#1448. Count Good Nodes in Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution(object):

    # DFS : 深度优先遍历
    def goodNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.result = 0
        def dfs(node, maxValue):
            if not node: return
            if node.val >= maxValue:
                maxValue = node.val
                self.result += 1
            dfs(node.left, maxValue)
            dfs(node.right, maxValue)
        dfs(root, float('-inf'))
        return self.result
