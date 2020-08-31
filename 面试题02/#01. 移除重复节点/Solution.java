/*
 * @Author: Goog Tech
 * @Date: 2020-08-31 14:02:08
 * @LastEditTime: 2020-08-31 14:02:46
 * @Description: https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 * @FilePath: \leetcode-googtech\面试题02\#01. 移除重复节点\Solution.java
 * @WebSite: https://algorithm.show/
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
    public ListNode removeDuplicateNodes(ListNode head) {
        // 判断头节点是否为空
        if(head == null) return null;
        // 为了移动指针时不破坏链表结构,初始化虚拟头节点以及 pre 哨兵节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        // 通过移动 pre 节点指针循环遍历链表
        while(pre.next != null) {
            // 获取 pre 哨兵节点的下一个节点
            ListNode currentNode = pre.next;
            // 通过移动 currentNode 节点指针循环遍历链表
            while(currentNode.next != null) {
                // 若当前 pre 的节点值与其后的 currentNode 节点的值相同,
                // 则将 currentNode 节点指针指向其后的第二个节点,即删除 currentNode 的后一个节点
                if(pre.next.val == currentNode.next.val) {
                    currentNode.next = currentNode.next.next;
                // 反之继续向后移动 currentNode 节点指针,继续寻找重复元素
                }else {
                    currentNode = currentNode.next;
                }
            }
            // 向后移动 pre 指针节点,继续判断 pre.next 节点是否与其下一个节点 currentNode.next 的值相同
            pre = pre.next;
        }
        // 返回移除重复元素后的链表头节点
        return dummyHead.next;
    }
}
