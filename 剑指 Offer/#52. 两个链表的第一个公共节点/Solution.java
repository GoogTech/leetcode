/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 10:06:54
 * @LastEditTime: 2020-08-21 10:07:31
 * @Description: https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#52. 两个链表的第一个公共节点\Solution.java
 * @WebSite: https://algorithm.show/
 */

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

    // 双指针法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       // 判断头节点是否为空
       if(headA == null || headB == null) return null;
       // 题目要求: 勿破坏原链表结构
       ListNode nodeA = headA, nodeB = headB;
       // 循环遍历链表
       while(nodeA != nodeB) {
            // 若nodeA到了末尾,则令nodeA = headB,然后继续遍历
            nodeA = nodeA == null ? headB : nodeA.next;
            // 若nodeB到了末尾,则令nodeB = headA,然后继续遍历
            nodeB = nodeB == null ? headA : nodeB.next;
       }
       // 返回结果
       return nodeA;
    }
}
