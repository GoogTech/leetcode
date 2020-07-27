'''
@Author: Goog Tech
@Date: 2020-07-27 10:17:38
@Description: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\145.二叉树的后序遍历.py
'''

#
# @lc app=leetcode.cn id=145 lang=python
#
# [145] 二叉树的后序遍历
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    '''
    递归法
    '''
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        if root is None: return []
        # [] + [3,2] + [1]
        return self.postorderTraversal(root.left) + self.postorderTraversal(root.right) + [root.val]

    '''
    迭代法
    前序的遍历顺序是“根左右”,而后序是“左右根”
    所以模仿前序生成先“根右左”,然后再反转就是“左右根”咯
    '''
    def postorderTraversal(self, root):
        # 判断根节点是否为空
        if root is None: return []
        # 初始化辅助栈及声明用于存储结果的列表
        result, stack, current = [], [root], root
        # 重复操作:将栈中根节点弹出并存储到list中,然后将左及右节点依次压入栈中
        while stack:
            current = stack.pop()
            result.append(current.val)
            # 根据Stack的特性,即FILO可知先弹出右节点
            if current.left is not None:
                stack.append(current.left)
            if current.right is not None:
                stack.append(current.right)
        # 反转输出列表
        return result[::-1]


# @lc code=end

