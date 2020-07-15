/*
 * @Author: Goog Tech
 * @Date: 2020-07-15 23:29:09
 * @Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @FilePath: \leetcode-googtech\#237. Delete Node in a Linked List\Solution.java
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
    // node表示的是要删除的结点
    public void deleteNode(ListNode node) {
        // 前移待删除节点后的一个节点的值
        node.val = node.next.val;
        // 更新待删除节点的指针
        node.next = node.next.next;
    }
}

/*
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
*/
