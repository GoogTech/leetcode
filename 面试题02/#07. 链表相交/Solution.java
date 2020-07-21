/*
 * @Author: Goog Tech
 * @Date: 2020-07-21 20:46:33
 * @Description: https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 * @Reference: https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/solution/shuang-zhi-zhen-zou-liang-bian-zou-dao-di-er-bian-/
 * @FilePath: \leetcode-googtech\面试题02\#07. 链表相交\Solution.java
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
    // 双指针法:一个指向A链表,一个指向B链表
    // 长链表A和短链表B加起来长度为L,那么让两个指针走相同的长度,
    // 如果不能相遇则证明没有交点,反之有交点. 例如: AO + OC + BO == BO + OC + AO
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA,pB = headB;
        while(pA!=pB){
            pA = pA.next == null? headB : pA.next;
            pB = pB.next == null? headA : pB.next;
        }
        return pA;
    }
}
