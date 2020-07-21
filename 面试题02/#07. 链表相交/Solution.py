'''
@Author: Goog Tech
@Date: 2020-07-21 20:46:44
@Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
@Reference: https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/solution/shuang-zhi-zhen-zou-liang-bian-zou-dao-di-er-bian-/
@FilePath: \leetcode-googtech\面试题02\#07. 链表相交\Solution.py
'''
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        
        """
        双指针题法: 让两个指针分别从A和B点往C点走
        两个指针分别走到C后，又各自从另外一个指针的起点，也就是A指针第二次走从B点开始走，B指针同理.
        这样，A指针走的路径长度 AO + OC + BO 必定等于B指针走的路径长度 BO + OC + AO，
        这也就意味着这两个指针第二轮走必定会在O点相遇，相遇后也即到达了退出循环的条件，反之无交点.
        """
        pA,pB = headA,headB
        while pA!=pB:
            pA = pA.next if pA else headB
            pB = pB.next if pB else headA
        return pA
