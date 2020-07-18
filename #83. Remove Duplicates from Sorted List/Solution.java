/*
 * @Author: Goog Tech
 * @Date: 2020-07-18 21:48:10
 * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @FilePath: \leetcode-googtech\#83. Remove Duplicates from Sorted List\Solution.java
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        // 判断头节点是否为空
        if(head==null || head.next==null){
            return head;
        }
        // 遍历寻找并删除重复节点
        while(currentNode.next!=null){
            if(currentNode.val == currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
        // 返回头节点
        return head;
    }
}
