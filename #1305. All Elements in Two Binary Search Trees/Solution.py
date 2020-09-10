'''
Author: Goog Tech
Date: 2020-09-10 17:20:02
LastEditTime: 2020-09-10 17:20:53
Description: https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/
FilePath: \leetcode-googtech\#1305. All Elements in Two Binary Search Trees\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归式中序遍历 + 双指针排序
    def getAllElements(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: List[int]
        """
        # 分别获取两个搜索二叉树中的所有节点值
        t1, t2 = self.sortTree(root1), self.sortTree(root2)
        # 初始化结果列表及双指针
        result, p1, p2 = [], 0, 0
        # 循环遍历两列表中的节点值
        while p1 < len(t1) and p2 < len(t2):
            # 通过移动双指针将两列表中的节点值有序地添加到结果列表中
            if t1[p1] <= t2[p2]:
                result.append(t1[p1])
                p1 += 1
            else:
                result.append(t2[p2])
                p2 += 1
        # 若当前指针 p1 的长度等于列表 t1 的长度,则说明 t1 列表已遍历完毕
        # 进而将 t2 中未遍历的元素添加到结果列表尾部,并返回结果
        if p1 == len(t1):
            return result + t2[p2:]
        # 反之将 t1 中未遍历的元素添加到结果列表尾部,并返回结果
        else:
            return result + t1[p1:]
        
    # 递归获取搜索二叉树中的节点值
    # 利用搜索二叉树的特性,该递归算法返回树中所有节点值的升序序列
    def sortTree(self, root):
        # 判断当前节点是否为空
        if not root: return []
        # 初始化用于存储左右孩子节点值的列表
        left, right = [], []
        # 若当前节点的左孩子节点不为空,则递归遍历其左孩子节点,并将其添加到左孩子节点列表中
        if root.left:
            left += self.sortTree(root.left)
        # 同理将递归遍历右孩子节点,并将其添加到右孩子节点列表中
        if root.right:
            right += self.sortTree(root.right)
        # 返回当前二叉搜索树中的所有节点值
        return left + [root.val] + right
