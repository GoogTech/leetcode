/*
 * @Author: Goog Tech
 * @Date: 2020-07-18 22:10:42
 * @Description: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @FilePath: \leetcode-googtech\#876. Middle of the Linked List\Solutoin.java
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
    // 快指针fastNode每次走2步,慢指针slowNode每次走1步,
    // 当fastNode走到末尾时slowNode正好走到中间
    public ListNode middleNode(ListNode head) {
       ListNode fastNode = head,slowNode = head;
       while(fastNode!=null && fastNode.next!=null){
           fastNode = fastNode.next.next;
           slowNode = slowNode.next;
       } 
       return slowNode;
    }
}
