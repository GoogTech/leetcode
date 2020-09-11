'''
Author: Goog Tech
Date: 2020-09-11 15:42:12
LastEditTime: 2020-09-11 15:42:48
Description: https://leetcode-cn.com/problems/deepest-leaves-sum/
FilePath: \leetcode-googtech\#1302. Deepest Leaves Sum\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 维护两个全局变量 maxDepth 和 total
    # maxDepth 用于记录搜索到的节点的最大深度值, total 则用于记录层数最深的叶子节点的和
    def __init__(self):
        self.total = 0
        self.maxDepth = -1
        
    # 深度优先遍历
    # 从根节点开始进行搜索,在搜索的同时记录当前节点的深度
    def deepestLeavesSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node, depth):
            # 判断当前节点是否为空
            if not node: return
            # 若当前节点的深度 depth 大于 maxDepth,则重新对两个全局变量进行初始化
            if depth > self.maxDepth:
                self.maxDepth, self.total = depth, node.val
            # 若等于则将当前叶子节点 node 的权值累加到 total 中 
            # 若小于则忽略,进而继续进行深度搜索
            elif depth == self.maxDepth:
                self.total += node.val
            # 对当前节点的左右子树继续进行深度遍历
            dfs(node.left, depth + 1)
            dfs(node.right, depth + 1)
        # 传入二叉树的根节点及初始深度值
        dfs(root, 0)
        # DFS 结束后,深度最大的叶子节点的权值之和即存储在 total 中
        return self.total
