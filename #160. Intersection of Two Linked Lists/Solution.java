/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 11:48:46
 * @LastEditTime: 2020-08-04 12:04:49
 * @Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.java
 */

/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 判断头节点是否为空
        if(headA == null || headB == null) return null;
        // 题目要求: 勿破坏原链表结构
        ListNode nodeA = headA, nodeB = headB;
        // 循环遍历链表
        while(nodeA != nodeB) {
            // 如果nodeA到了末尾,则令nodeA = headB,然后继续遍历
            nodeA = nodeA == null ? headB : nodeA.next;
            // 如果nodeB到了末尾,则令nodeB = headA,然后继续遍历
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        return nodeA;
    }
}

// @lc code=end
