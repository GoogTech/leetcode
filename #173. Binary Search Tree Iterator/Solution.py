'''
Author: Goog Tech
Date: 2020-09-02 21:45:08
LastEditTime: 2020-09-02 21:46:17
Description: https://leetcode-cn.com/problems/binary-search-tree-iterator/
FilePath: \leetcode-googtech\#173. Binary Search Tree Iterator\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class BSTIterator(object):

    def __init__(self, root):
        """
        :type root: TreeNode
        """
        self.stack = []
        while root:
            self.stack.append(root)
            root = root.left

    def next(self):
        """
        @return the next smallest number
        :rtype: int
        """
        temp =self.stack.pop()
        result = temp.val
        temp = temp.right
        while temp:
            self.stack.append(temp)
            temp = temp.left
        return result

    def hasNext(self):
        """
        @return whether we have a next smallest number
        :rtype: bool
        """
        return self.stack != []

# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()
