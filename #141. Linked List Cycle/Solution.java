/*
 * @Author: Goog Tech
 * @Date: 2020-07-18 22:41:10
 * @Description: https://leetcode-cn.com/problems/linked-list-cycle/
 * @FilePath: \leetcode-googtech\#141. Linked List Cycle\Solution.java
 */ 

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    // 快慢指针
    // 如果有环,经多次遍历后慢指针与快指针一定会在环中的某个结点相遇
    public boolean hasCycle(ListNode head) {
        ListNode fastNode = head, slowNode = head;
        while(fastNode!=null&&fastNode.next!=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode==slowNode){
                return true;
            }
        }   
        return false;
    }
}
