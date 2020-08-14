'''
Author: Goog Tech
Date: 2020-08-14 17:16:18
LastEditTime: 2020-08-14 17:27:49
Description: https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
FilePath: \leetcode-googtech\#1290. Convert Binary Number in a Linked List to Integer\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1290 lang=python
#
# [1290] 二进制链表转整数
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    
    # 二进制转换为十进制: 整数部分的数值依次乘以2的幂次并逐个相加
    def getDecimalValue(self, head):
        """
        :type head: ListNode
        :rtype: int
        """
        currentNode = head
        result = 0
        while currentNode:
            result = result * 2 + currentNode.val
            currentNode = currentNode.next
        return result        
# @lc code=end
