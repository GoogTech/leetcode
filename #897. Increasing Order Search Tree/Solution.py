'''
Author: Goog Tech
Date: 2020-09-13 14:40:49
LastEditTime: 2020-09-13 14:41:21
Description: https://leetcode-cn.com/problems/increasing-order-search-tree/
FilePath: \leetcode-googtech\#897. Increasing Order Search Tree\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 查找树也称搜索树或排序树,其特性为: 左孩子比根节点小,右孩子比根节点大,
    # 进而中序遍历会得到一个递增序列.
    def increasingBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        def inorder(root):
            if not root: return []
            else: return inorder(root.left) + [root.val] + inorder(root.right);

        # 通过中序遍历得到一个递增序列的列表数组
        alist = inorder(root)
        # 初始化根节点及其指针
        newRoot = TreeNode(alist[0])
        currentNode = newRoot
        # 用已经有序的的列表元素构建结果树
        for i in range(1, len(alist)):
            currentNode.right = TreeNode(alist[i])
            currentNode = currentNode.right
        # 返回结果树的根节点
        return newRoot
