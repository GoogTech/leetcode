'''
Author: Goog Tech
Date: 2020-09-14 17:56:15
LastEditTime: 2020-09-14 17:57:04
Description: https://leetcode-cn.com/problems/find-bottom-left-tree-value/
FilePath: \leetcode-googtech\#513. Find Bottom Left Tree Value\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    # BFS : 广度优先遍历
    # 解题思路 : 通常 BFS 遍历都是从上到下,从左到右,
    # 然而根据题目要求,故采用先上后下,先右后左的遍历策略,
    # 进而最后一个元素必然是最下方最左边的元素,最后将该节点的值 node.val 返回即可.
    def findBottomLeftValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        queue = [root]
        while queue:
            node = queue.pop(0)
            if node.right: queue.append(node.right)
            if node.left: queue.append(node.left)
        return node.val
