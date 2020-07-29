'''
@Author: Goog Tech
@Date: 2020-07-29 11:07:27
@LastEditTime: 2020-07-29 11:50:55
@Description: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
@FilePath: \leetcode-googtech\#589. N-ary Tree Preorder Traversal\589.n叉树的前序遍历.py
'''

#
# @lc app=leetcode.cn id=589 lang=python
#
# [589] N叉树的前序遍历
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
    def preorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        result = []
        def dfs(root):
            if not root: return []
            result.append(root.val)
            for children in root.children: dfs(children)
        dfs(root)
        return result
    
    '''
    迭代法
    '''
    def preorder(self, root):
        # 判断头节点是否为空
        if not root: return []
        # 初始化辅助栈和结果列表
        result, stack = [], [root]
        # 循环遍历辅助栈
        while stack:
            # 每次循环将栈顶元素出栈
            currentNode = stack.pop()
            # 将栈顶元素存储到结果列表中
            result.append(currentNode.val)
            # 然后将栈顶元素的孩子节点从右至左压入栈中(出栈顺序:从左至右)
            for children in currentNode.children[::-1]:
                stack.append(children)
        # 返回结果列表
        return result

# @lc code=end
