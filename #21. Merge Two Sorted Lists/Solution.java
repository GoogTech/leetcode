/*
 * @Author: Goog Tech
 * @Date: 2020-07-27 18:38:24
 * @Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\21.合并两个有序链表.java
 */ 

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // 迭代法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 判断链表是否为空
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        // 初始化哨兵节点与其头指针
        ListNode preHead = new ListNode(-1);
        ListNode currentNode = preHead;
        // 遍历链表并逐个比较两节点大小,通过移动哨兵节点头指针来构建新链表
        while(l1 != null && l2 != null) {
            if(l1.val >= l2.val) {
                currentNode.next = l2;
                l2 = l2.next;
            }else {
                currentNode.next = l1;
                l1 = l1.next;
            }
            // 每比较一次,哨兵头指针都需要往后移动一位
            currentNode = currentNode.next;
        }
        //l1与l2合并结束后,最多还剩一个链表是非空的,这时需将链表末尾指向未合并完的链表
        currentNode.next = l2 == null ? l1 : l2;
        return preHead.next;
    }
}


// @lc code=end
