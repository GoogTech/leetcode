'''
@Author: Goog Tech
@Date: 2020-07-25 18:53:16
@Description: https://leetcode-cn.com/problems/count-complete-tree-nodes/
@FilePath: \leetcode-googtech\#222. Count Complete Tree Nodes\Solution.py
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # 递归法
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # 判断根节点是否为空
        if not root:
            return 0
        # 获取左右子树的高度
        leftHeight,rightHeight = self.getHeight(root.left),self.getHeight(root.right)
        # 如果左右子树的高度相同则代表左子树为满二叉树,其节点数为2^leftHeight,即pow(2,leftHeight)-1个
        # 而右子树中的节点数可以通过递归的方法获取,即总结数为:左子树节点数 + 根节点数 + 右子树节点数
        if leftHeight == rightHeight:
            return (pow(2,leftHeight)-1) + 1 + self.countNodes(root.right)
        else:
            # 反之则代表最后一层不满(倒数第二层是满的),此时右子树的节点数为2^rightHeight,即pow(2,rightHeight)-1个
            # 而左子树中的节点数可以通过递归的方法获取,即总结点数为:右子树节点数 + 根节点数 + 左子树节点数
            return (pow(2,rightHeight)-1) + 1 + self.countNodes(root.left)
    
    # 获取左右子树的高度
    def getHeight(self,root):
        level = 0
        # 根据完全二叉树的性质可知,若左子树不为空则高度可加1
        while root:
            level+=1
            root = root.left
        return level
