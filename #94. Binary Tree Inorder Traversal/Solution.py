'''
@Author: Goog Tech
@Date: 2020-07-26 19:19:05
@Description: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
@FilePath: \leetcode-googtech\#94. Binary Tree Inorder Traversal\94.二叉树的中序遍历.py
'''

#
# @lc app=leetcode.cn id=94 lang=python
#
# [94] 二叉树的中序遍历
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    
    # 递归法
    # def inorderTraversal(self, root):
    #     """
    #     :type root: TreeNode
    #     :rtype: List[int]
    #     """
    #     if root is None: return []
    #     # [] + [1] + [2,3]
    #     return self.inorderTraversal(root.left) + [root.val] + self.inorderTraversal(root.right)

    # 迭代法
    def inorderTraversal(self, root):
        # 初始化辅助栈及结果列表
        result, stack = [], []
        # 判断头节点是否为空
        if root is None: return result
        currentNode = root
        # 遍历辅助栈
        while stack or currentNode:
            # 遍历根节点的左孩子节点并将其依次压入栈中,直到为空然后进入操作2
            if currentNode is not None: # 操作1
                stack.append(currentNode)
                currentNode = currentNode.left
            # 弹出栈顶元素,若其有右孩子,则将右孩子节点压入栈中,随后重复操作1
            else: # 操作2
                currentNode = stack.pop()
                result.append(currentNode.val)
                currentNode = currentNode.right
        return result

# @lc code=end
