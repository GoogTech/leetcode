'''
Author: Goog Tech
Date: 2020-09-15 10:53:53
LastEditTime: 2020-09-15 10:54:21
Description: https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/
FilePath: \leetcode-googtech\#1315. Sum of Nodes with Even-Valued Grandparent\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # DFS : 深度优先遍历
    def sumEvenGrandparent(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node, parent, grandparent):
            if not node: return 0
            result = 0
            if grandparent % 2 == 0: result += node.val
            result += dfs(node.left, node.val, parent)
            result += dfs(node.right, node.val, parent)
            return result
        return dfs(root, -1, -1)
