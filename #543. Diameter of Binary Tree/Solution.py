'''
Author: Goog Tech
Date: 2020-10-27 13:34:34
LastEditTime: 2020-10-27 13:37:31
Description: https://leetcode-cn.com/problems/diameter-of-binary-tree/
FilePath: \leetcode-googtech\#543. Diameter of Binary Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 注意: 最大的直径不一定是经过根节点的,其可能出现在子树中,那么将此题转换成求每个节点
    # 的左右子树最大深度和即可
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.result = 0
        # Depth First Search    
        def dfs(node):
            if not node: return 0
            leftHeight, rightHeight = dfs(node.left), dfs(node.right)
            self.result = max(self.result, leftHeight + rightHeight)
            return max(leftHeight, rightHeight) + 1
        dfs(root)
        return self.result
