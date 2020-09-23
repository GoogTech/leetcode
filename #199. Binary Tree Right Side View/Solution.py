'''
Author: Goog Tech
Date: 2020-09-23 21:08:37
LastEditTime: 2020-09-23 21:08:53
Description: https://leetcode-cn.com/problems/binary-tree-right-side-view/
FilePath: \leetcode-googtech\#199. Binary Tree Right Side View\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # BFS : 广度优先搜索,即层次遍历
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # 判断根节点是否为空
        if not root: return []
        # 初始化双端队列以及结果列表
        queue, result = collections.deque([root]), []
        # 循环遍历队列
        while queue:
            # 逐个遍历队列中的每个元素
            for _ in range(len(queue)):
                # 将队首节点出队,并将其左右孩子节点入队
                node = queue.popleft()
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            # 每次将当前深度的最后一个节点,即最右边的节点加入到结果列表中
            result.append(node.val)
        # 返回结果
        return result
