'''
Author: Goog Tech
Date: 2020-09-10 20:05:58
LastEditTime: 2020-09-10 20:06:38
Description: https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
FilePath: \leetcode-googtech\#530. Minimum Absolute Difference in BST\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node):
            if node:
                dfs(node.left)
                # 利用搜索二叉树的特性,即中序遍历会将树中节点数值从小到大顺序输出,所以 node.val > prev.val
                # 进而只需要遍历计算相邻数的差值,取其中最小值即可.
                # self.result = min(self.result, node.val - self.prev)
                self.result = min(self.result, abs(self.prev - node.val))
                self.prev = node.val
                dfs(node.right)
        # Python 用如下的方式表示正负无穷,即规定所有的数都比 -inf 大,所有的小都比 inf 小
        self.prev = float('-inf')
        self.result = float('inf')
        dfs(root)
        return self.result
