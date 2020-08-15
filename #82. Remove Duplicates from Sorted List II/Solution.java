/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 16:48:30
 * @LastEditTime: 2020-08-15 17:33:33
 * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 * @FilePath: \leetcode-googtech\#82. Remove Duplicates from Sorted List II\Solution.java
 * @Reference: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/solution/cai-niao-di-yi-ci-xie-ti-jie-zhi-shi-dui-jie-ti-gu/
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
 */

// @lc code=start
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
        // 初始化辅助节点
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        // 初始化辅助节点指针
        ListNode currentNode = listNode;
        // 通过移动当前指针 currrentNode 来循环遍历链表
        while(currentNode.next != null && currentNode.next.next != null) {
            // 判断当前节点的下一个节点(真实链表的头节点)的值与下下个节点的值是否相同
            if(currentNode.next.val == currentNode.next.next.val) {
                // 初始化待删节点,即将重复的节点视为单独的一个链表
                // 有重复就将指向待删节点的指针往后移,直到指向待删链表的最后一个节点
                ListNode tempNode = currentNode.next;
                while(tempNode != null && tempNode.next != null && tempNode.val == tempNode.next.val) {
                    tempNode = tempNode.next;
                }
                // 将待删接节点的前节点指针指向 tempNode 的后一个节点,即可实现删除所有重复节点
                currentNode.next = tempNode.next;
            }else {
                // 继续移动当前节点指针,进入下一个循环来继续判断链表中是否有相邻重复的节点
                currentNode = currentNode.next;
            }
        }
        // 返回真实链表的头节点
        return listNode.next;
    }
}
// @lc code=end
