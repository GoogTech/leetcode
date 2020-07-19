/*
 * @Author: Goog Tech
 * @Date: 2020-07-19 22:06:49
 * @Description: https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#22. 链表中倒数第k个节点\Solution.java
 */
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    // 快慢指针法
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slowNode = head,fastNode = head;
        // 先让快指针走k步
        for(int i=0;i<k;i++){
            fastNode = fastNode.next;
        }
        // 然后两个指针同步走
        // 当快指针走到头时,慢指针就是链表倒数第k个节点
        while(fastNode!=null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}
