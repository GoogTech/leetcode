/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 09:54:24
 * @LastEditTime: 2020-08-24 10:33:26
 * @Description: https://leetcode-cn.com/problems/add-two-numbers/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\2.两数相加.java
 * @WebSite: https://algorithm.show/
 * @Reference: https://leetcode-cn.com/problems/add-two-numbers/solution/hua-jie-suan-fa-2-liang-shu-xiang-jia-by-guanpengc/
 */

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 初始化预先指针pre,该指针的下一个节点指向真正的头结点head
        ListNode pre = new ListNode(0);
        ListNode currentNode = pre;
        // 初始化进位值,因每一位计算的同时需要考虑上一位的进位问题
        int carry = 0;
        // 循环遍历链表节点,若两个链表遍历完毕后进位值为1,则将其作为新链表的尾节点
        while(l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            // 舍去最后一位数值进而获得进位值
            carry = sum / 10;
            // 获取最后一位数值并将其作为下一个节点的值,其中 1 % 10 = 1
            currentNode.next = new ListNode(sum % 10); 
            // 向后移动一位当前指针
            currentNode = currentNode.next; 
            // 判断当前链表节点是否为空
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        // 返回结果链表
        return pre.next;
    }
}
// @lc code=end]
