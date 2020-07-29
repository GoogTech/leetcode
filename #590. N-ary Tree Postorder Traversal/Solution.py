'''
@Author: Goog Tech
@Date: 2020-07-29 12:58:33
@LastEditTime: 2020-07-29 15:09:54
@Description: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
@FilePath: \leetcode-googtech\#590. N-ary Tree Postorder Traversal\590.n叉树的后序遍历.py
'''

#
# @lc app=leetcode.cn id=590 lang=python
#
# [590] N叉树的后序遍历
#

# @lc code=start
"""
# Definition for a Node.
class Node(object):
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution(object):

    '''
    递归法
    '''
    def postorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        # 初始化结果列表
        result = []
        # 递归调用当前节点的孩子节点
        def dfs(root):
            # 判断头节点是否空
            if not root: return []
            # 递归根节点的左右孩子节点,并将其添加到结果队列中
            for children in root.children: dfs(children)
            # 将根节点添加到结果队列中
            result.append(root.val)
        dfs(root)
        return result

    '''
    迭代法: 数组队列 + 辅助栈
    '''
    def postorder(self, root):
        # 判断头节点是否为空
        if not root: return []
        # 初始化结果列表及辅助栈
        result, stack = [], [root]
        # 循环遍历辅助栈
        while stack:
            # 每次循环获取并删除栈尾元素,
            # pop(): 默认移除列表中的最后一个元素
            currentNode = stack.pop()
            # 将栈尾元素存储到结果列表中(根节点->右节点->左节点)
            result.append(currentNode.val)
            # 然后将栈尾元素的孩子节点从左至右顺序入栈,所以出栈尾节点为右节点
            if currentNode.children is not None:
                for children in currentNode.children:
                    stack.append(children)
        # 将结果列表反转并返回
        return result[::-1]
# @lc code=end
