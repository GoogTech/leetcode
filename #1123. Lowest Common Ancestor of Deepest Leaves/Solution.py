'''
Author: Goog Tech
Date: 2020-09-27 17:55:36
LastEditTime: 2020-09-27 17:57:17
Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/
FilePath: \leetcode-googtech\#1123. Lowest Common Ancestor of Deepest Leaves\Solution.py
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
    # 如果左右子树高度相等,则当前结点为要找的结点
    # 否则要找的结点在高度较大的子树中,进而自底向上的计算高度并返回寻找到的结点
    def lcaDeepestLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        def depth(node):
            if not node: return 0
            leftDepth = depth(node.left)
            rightDepth = depth(node.right)
            return max(leftDepth, rightDepth) + 1
        if not root: return None
        leftDepth = depth(root.left)
        rightDepth = depth(root.right)
        return root if leftDepth == rightDepth else self.lcaDeepestLeaves(root.left) if leftDepth > rightDepth else self.lcaDeepestLeaves(root.right)
