'''
@Author: Goog Tech
@Date: 2020-07-26 12:31:40
@Description: In User Settings Edit
@FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.py
@Reference: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/bfs-de-shi-yong-chang-jing-zong-jie-ceng-xu-bian-l/
'''
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # Breadth First Search:使用队列实现二叉树的层次遍历
    def levelOrder(self,root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 存储每层的节点列表
        result = []
        # 辅助队列
        queue = [root]
        # 判断头节点是否为空
        if not root:
            return result
        # 遍历队列
        while queue:
            # root非空时,第一层的节点数为1
            length = len(queue)
            # 存储每层的节点
            alist = []
            # 进行n次循环,确保当前层的的节点全部出队列
            for i in range(length):
                node = queue.pop(0)
                # 存储当前节点
                alist.append(node.val)
                # 把当前节点所有的左右节点全部加入队列,进而确保当前队列的len就是下一层的节点数
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            # 将每层的节点列表加入结果列表中
            result.append(alist)
        # 返回结果
        return result
