'''
@Author: Goog Tech
@Date: 2020-07-27 10:56:50
@Description: #94 #144 #145: Binary Tree Traversal Template
@FilePath: \leetcode-googtech\#94 #144 #145 Binary Tree Traversal Template\Template.py
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    '''
    前序遍历: 递归法
    '''
    def preorderTraversal(self, root):
        return [] if root is None else [root.val] + self.preorderTraversal(
            root.left) + self.preorderTraversal(root.right)

    '''
    中序遍历: 递归法
    '''
    def inorderTraversal(self, root):
        return [] if root is None else self.inorderTraversal(
            root.left) + [root.val] + self.inorderTraversal(root.right)

    '''
    后序遍历: 递归法
    '''
    def postorderTraversal(self, root):
        return [] if root is None else self.postorderTraversal(
            root.left) + self.postorderTraversal(root.right) + [root.val]

    '''
    前序遍历: 迭代法
    '''
    def preorderTraversal(self, root):
        # 判断根节点是否为空
        if root is None: return []
        # 初始化辅助栈及结果列表
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

    '''
    中序遍历: 迭代法
    '''
    def inorderTraversal(self, root):
        # 初始化辅助栈及结果列表
        result, stack, currentNode = [], [], root
        # 判断头节点是否为空
        if root is None: return result
        currentNode = root
        # 遍历辅助栈
        while stack or currentNode:
            # 遍历左孩子节点并将其依次压入栈中,直到为空然后进入操作2
            if currentNode is not None:  # 操作1
                stack.append(currentNode)
                currentNode = currentNode.left
            # 弹出栈顶元素,若其有右孩子,则将右孩子节点压入栈中,随后重复操作1
            else:  # 操作2
                currentNode = stack.pop()
                result.append(currentNode.val)
                currentNode = currentNode.right
        return result

    '''
    后续遍历: 迭代法
    前序的遍历顺序是“根左右”,而后序是“左右根”
    所以可以先模仿前序生成“根右左”,然后再反转就是“左右根”咯
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
        # 反转列表
        return result[::-1]
