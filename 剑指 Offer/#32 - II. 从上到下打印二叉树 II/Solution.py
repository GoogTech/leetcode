'''
Author: Goog Tech
Date: 2020-08-20 11:06:05
LastEditTime: 2020-08-20 11:07:08
Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#32 - II. 从上到下打印二叉树 II\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    # Breadth Fist Search: 使用队列实现二叉树的层次遍历
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 初始化 result 其用于存储每层的节点列表
        result = []
        # 初始化辅助队列,并将根节点入队
        queue = [root]
        # 判断头节点是否为空
        if not root: return result
        # 循环遍历队列
        while queue:
            # root非空时,第一层的节点数为一
            length = len(queue)
            # 初始化 alist 其用于存储当前层的节点
            alist = []
            # 进行 n 次遍历,确保当前层的节点数全部出队列
            for i in range(length):
                # 将队首节点出队
                node = queue.pop(0)
                # 将当前层的节点存储到 alist 集合中
                alist.append(node.val)
                # 把当前节点所有的左右孩子节点全部加入队列,进而确保当前队列的 length 就是下一层的节点数
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            # 将每层的节点列表加入到结果列表中
            result.append(alist)
        # 返回结果
        return result
