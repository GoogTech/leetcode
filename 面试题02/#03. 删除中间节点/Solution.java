/*
 * @Author: Goog Tech
 * @Date: 2020-07-19 22:29:43
 * @Description: https://leetcode-cn.com/problems/delete-middle-node-lcci/
 * @FilePath: \leetcode-googtech\面试题02\#03. 删除中间节点\Solution.java
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
    public void deleteNode(ListNode node) {
        // 更新待删除节点的值及指针
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
