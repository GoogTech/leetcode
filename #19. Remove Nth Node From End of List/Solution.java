/*
 * @Author: Goog Tech
 * @Date: 2020-07-22 19:59:46
 * @Description: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @FilePath: \leetcode-googtech\#19. Remove Nth Node From End of List\Solution.java
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
    // 双指针法
    public ListNode removeNthFromEnd(final ListNode head, final int n) {
        // 判断头节点是否为空
        if(head==null) {
            return null;
        }
        // fastNode指向待删节点的后节点,slowNode指向待删节点的前节点
        ListNode fastNode = head;
        ListNode slowNode = head;
        // 移动快指针,使其指待删节点的前节点
        for(int i=0;i<n;i++) {
            fastNode = fastNode.next;
        }
        // 待删节点即为第一个节点
        if(fastNode == null) {
            return head.next;
        }
        // 同时移动头指针和尾指针
        // 当fastNode指针指向尾节点时,slowNode所指节点即为待删节点的前节点
        while(fastNode.next!=null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        // 更新待删节点的前节点指针,即移除待删节点
        slowNode.next = slowNode.next.next;
        return head;
    }
}
