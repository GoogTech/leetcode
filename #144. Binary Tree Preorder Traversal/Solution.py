'''
@Author: Goog Tech
@Date: 2020-07-26 17:58:32
@Description: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
@FilePath: \leetcode-googtech\#144. Binary Tree Preorder Traversal\Solution.py
'''

#
# @lc app=leetcode.cn id=144 lang=python
#
# [144] 二叉树的前序遍历
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # 迭代法: root->left->right
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # 判断根节点是否为空
        if root is None: return []
        # 初始化辅助栈及声明用于存储结果的列表
        stack, result = [root], []
        # 重复操作:将栈中根节点弹出并存储到list中,然后将右及左节点压入栈中
        while stack:
            root = stack.pop()
            result.append(root.val)
            # 根据Stack的特性,即FILO可知先弹出左节点
            if root.right is not None:
                stack.append(root.right)
            if root.left is not None:
                stack.append(root.left)
        return result

    # 递归法:
    def preorderTraversal(self, root):
        if root is None: return []
        # [1] + [] + [2,3]
        return [root.val] + self.preorderTraversal(root.left) + self.preorderTraversal(root.right)


# @lc code=end
