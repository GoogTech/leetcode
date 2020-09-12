'''
Author: Goog Tech
Date: 2020-09-12 11:36:15
LastEditTime: 2020-09-12 11:36:59
Description: https://leetcode-cn.com/problems/cousins-in-binary-tree/
FilePath: \leetcode-googtech\#993. Cousins in Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution(object):

    #  解题思路: 利用深度优先搜索及递归求出每一个节点的深度与父节点
    def isCousins(self, root, x, y):
        """
        :type root: TreeNode
        :type x: int
        :type y: int
        :rtype: bool
        """
        parent, depth = {}, {}
        def dfs(node, par = None):
            # 判断当前节点,即上一个节点的孩子节点是否为空
            if node:
                # 对于每一个节点 node,它的父亲为 par,深度为 d,我们将其记录到 HashMap 中
                # 即令 parent[node.val] = par, depth[node.val] = d
                depth[node.val] = 1 + depth[par.val] if par else 0
                parent[node.val] = par
                # 传入当前节点的孩子节点及其父节点,即继续深度遍历
                dfs(node.left, node)
                dfs(node.right, node)
        dfs(root)
        # 当且仅当一对节点深度相同而父节点不同时,它们是堂兄弟节点.
        return depth[x] == depth[y] and parent[x] != parent[y]
