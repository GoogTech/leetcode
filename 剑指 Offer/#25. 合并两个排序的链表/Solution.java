/*
 * @Author: Goog Tech
 * @Date: 2020-08-18 15:19:44
 * @LastEditTime: 2020-08-18 15:21:19
 * @Description: https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#25. 合并两个排序的链表\Solution.java
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

    // 迭代法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 判断链表头节点是否为空
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        // 初始化哨兵节点及头指针
        ListNode previousHead = new ListNode(-1);
        ListNode currentNode = previousHead;
        // 遍历链表并逐个比较两节点值的大小,并通过移动哨兵节点头指针来构建新链表
        while(l1 !=null && l2 != null) {
            if(l1.val >= l2.val) {
                currentNode.next = l2;
                l2 = l2.next;
            }else {
                currentNode.next = l1;
                l1 = l1.next;
            }
            // 每一次比较后哨兵节点指针都需要往后移动一位
            currentNode = currentNode.next;
        }
        // l1与l2合并结束后,最多还剩一个链表是非空的,这时只需将链表尾指针指向未合完的链表即可
        currentNode.next = l2 == null ? l1 : l2;
        // 返回哨兵节点所指的已排序好的链表的头节点
        return previousHead.next;
    }
}
