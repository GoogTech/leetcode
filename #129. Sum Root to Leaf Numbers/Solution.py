'''
Author: Goog Tech
Date: 2020-09-28 11:44:10
LastEditTime: 2020-09-28 11:44:39
Description: https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
FilePath: \leetcode-googtech\#129. Sum Root to Leaf Numbers\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # DFS : 深度优先搜索
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # 判断根节点是否为空
        if not root: return 0
        # 初始化两个辅助栈(分别存储节点及其对应的值)及结果数值
        nodeStack, valueStack, result = [root], [root.val], 0
        # 循环遍历存储节点的辅助栈
        while nodeStack:
            # 将当前节点及其对应的节点值出栈
            node = nodeStack.pop()
            value = valueStack.pop()
            # 若当前节点为叶子节点,则说明找到了一条路径,进而将这条路径的值逐个加入到 result 中
            if not node.left and not node.right:
                result += value
            # 反之则说明当前出栈节点 node 不是叶子节点
            else:
                # 将子节点及子节点的值分别入栈,这里的子节点的值 = 指父节点的值 * 10 + 当前节点的值
                if node.right:
                    nodeStack.append(node.right);
                    valueStack.append(value * 10 + node.right.val)
                if node.left:
                    nodeStack.append(node.left)
                    valueStack.append(value * 10 + node.left.val)
        # 返回结果
        return result
