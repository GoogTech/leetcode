'''
Author: Goog Tech
Date: 2020-09-10 17:58:51
LastEditTime: 2020-09-10 17:59:28
Description: https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
FilePath: \leetcode-googtech\#783. Minimum Distance Between BST Nodes\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 中序遍历: 根据搜索二叉树的特性,中序遍历会将树中节点数值从小到大顺序输出
    # 进而只需要遍历计算相邻数的差值,取其中最小值即可.
    def minDiffInBST(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node):
            if node:
                dfs(node.left)
                self.result = min(self.result, abs(node.val - self.prev))
                self.prev = node.val
                dfs(node.right)
        # Python用如下方式表示正负无穷,即规定所有的数都比 -inf 大,所有数都比 inf 小
        self.prev = float('-inf')
        self.result = float('inf')
        dfs(root)
        return self.result
