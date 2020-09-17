'''
Author: Goog Tech
Date: 2020-09-17 12:30:16
LastEditTime: 2020-09-17 12:31:02
Description: https://leetcode-cn.com/problems/list-of-depth-lcci/
FilePath: \leetcode-googtech\面试题04\#03. 特定深度节点链表\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    # BFS : 广度优先搜索,即层次遍历
    def listOfDepth(self, tree):
        """
        :type tree: TreeNode
        :rtype: List[ListNode]
        """
        # 判断头节点是否为空
        if not tree: return []
        # 初始化模拟队列及结果列表
        queue, result = [tree], [] 
        # 判断队列是否为空
        while queue:
            # 初始化链表虚拟头节点及其指针
            dummyHead = ListNode(None)
            prev = dummyHead
            # 遍历辅助队列,其存储着二叉树当前深度的所有节点
            for i in range(len(queue)):
                # 获取队首节点
                node = queue.pop(0)
                # 将链表虚拟头节点的指针指向当前出队节点,即将其作为下一个节点
                prev.next = ListNode(node.val)
                prev = prev.next
                # 若当前出队节点的左右孩子不为空,则将其入队,进而对下个深度的节点进行遍历
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
            # 将二叉树当前深度的节点所构成的链表添加到结果列表中
            result.append(dummyHead.next)
        # 返回结果列表
        return result
