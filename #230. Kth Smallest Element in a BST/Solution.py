'''
Author: Goog Tech
Date: 2020-08-18 12:35:58
LastEditTime: 2020-08-18 12:36:44
Description: https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
FilePath: \leetcode-googtech\#230. Kth Smallest Element in a BST\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = 

class Solution(object):

    # 利用辅助栈及中序遍历: 左->根->右
    # 以及搜索二叉树的特性为: 左孩子节点 < 根节点 < 右孩子节点
    def kthSmallest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        # 判断头节点是否为空
        if not root: return None
        # 初始化辅助栈,结果列表及当前节点指针
        stack, result, currentNode = [], [], root
        # 循环遍历搜索二叉树,并判断当前辅助栈及节点是否为空
        while stack or currentNode:
            # 遍历左孩子节点并将其依次压入栈中
            if currentNode:
                stack.append(currentNode)
                currentNode = currentNode.left
            else:
                # 若当前节点无左孩子节点则将栈顶元素出栈,并将其节点值添加到结果列表中
                currentNode = stack.pop()
                result.append(currentNode.val)
                # 若当前列表中的元素个数等于 k 即表明列表中最后一个元素即为第 k 小的节点
                if len(result) == k: return result[-1]
                # 遍历右孩子节点
                currentNode = currentNode.right
