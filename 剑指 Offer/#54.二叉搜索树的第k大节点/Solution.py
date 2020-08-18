'''
Author: Goog Tech
Date: 2020-08-18 11:53:01
LastEditTime: 2020-08-18 11:53:37
Description: https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#54.二叉搜索树的第k大节点\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 中序遍历的逆序: 右->根->左, 可得到一个从大到小的序列
    def kthLargest(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: int
        """
        alist = []
        def inorder(root, k):
            if not root or k < 1: return -1
            # 若当前列表中的元素个数等于 k 即表明列表中最后一个元素即为第 k 大的节点
            if len(alist) == k: return
            # 中序遍历的逆序
            inorder(root.right, k)
            alist.append(root.val)
            inorder(root.left, k)
        inorder(root, k)
        # 返回列表中的最后一个元素
        return alist[k - 1]
