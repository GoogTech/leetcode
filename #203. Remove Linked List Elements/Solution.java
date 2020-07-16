/*
 * @Author: Goog Tech
 * @Date: 2020-07-16 16:59:54
 * @Description: https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @FilePath: \leetcode-googtech\#203. Remove Linked List Elements\Solution.java
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
    public ListNode removeElements(ListNode head, int val) {
        // 判断头节点是否为空
        if(head==null){
            return null;
        }

        // 初始化辅助节点
        ListNode newNode = new ListNode(0);
        newNode.next = head;

        // 初始化当前节点与前继节点指针 
        ListNode previousNode = newNode;
        ListNode currentNode = head; 

        // 遍历寻找待删除节点
        while(currentNode!=null){
            if(currentNode.val == val){
                previousNode.next = currentNode.next;
            }else{
                previousNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        // 返回头节点
        return newNode.next;
    }
}

/*
Remove all elements from a linked list of integers that have value val.

Example:
Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/