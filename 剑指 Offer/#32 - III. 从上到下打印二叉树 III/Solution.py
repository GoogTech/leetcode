'''
Author: Goog Tech
Date: 2020-09-23 20:59:45
LastEditTime: 2020-09-23 21:00:19
Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#32 - III. 从上到下打印二叉树 III\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # BFS : 广度优先遍历
    # Python 中使用 collections 中的 deque() 作为双端队列,其中 popleft() 方法的时间复杂度为O(1),
    # 而列表 list 的 pop(0) 方法的时间复杂度为 O(N).
    # 注: Java 中将链表 LinkedList 作为双端队列使用.
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 判断根节点是否为空
        if not root: return []
        # 初始化列表及双端队列,并将 root 转化为列表后入队
        result, deque = [], collections.deque([root])
        # 循环遍历辅助队列中的节点
        while deque:
            # 初始化临时辅助队列,其用于存储二叉树当前层的节点
            temp = collections.deque()
            # 遍历队列中的节点
            for _ in range(len(deque)):
                # 将队首节点出队
                node = deque.popleft()
                # 若结果列表中的列表个数为偶数,则从右向左存储当前层节点
                if len(result) % 2: temp.appendleft(node.val)
                # 反之则从左向右存储当前层节点
                else: temp.append(node.val)
                # 将当前出队节点的左右孩子节点入队
                if node.left: deque.append(node.left)
                if node.right: deque.append(node.right)
            # 将当前深度的节点列表存储到结果列表中
            result.append(list(temp))
        # 返回结果列表
        return result
