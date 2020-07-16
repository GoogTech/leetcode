/*
 * @Author: Goog Tech
 * @Date: 2020-07-17 06:54:07
 * @Description: https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#18. 删除链表的节点\Solution.java
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
    public ListNode deleteNode(ListNode head, int val) {
        // 判断头节点是否为空
        if(head==null){
            return head;
        }
        // 初始化待删除节点与其前置节点
        ListNode deletedNode = head;
        ListNode previousNode = null;
        // 判断待删除节点是否为头节点
        if(deletedNode.val==val){
            return head.next;
        }
        // 寻找待删除节点
        while(deletedNode.val!=val){
            previousNode = deletedNode;
            deletedNode = deletedNode.next;
        }
        // 通过更新指针来移除待删节点
        // 待删节点的前置节点的指针指向待删除节点的后一个节点
        previousNode.next = deletedNode.next;
        return head;
    }
}
