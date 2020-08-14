/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 17:21:48
 * @LastEditTime: 2020-08-14 17:27:42
 * @Description: https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * @FilePath: \leetcode-googtech\#1290. Convert Binary Number in a Linked List to Integer\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1290 lang=java
 *
 * [1290] 二进制链表转整数
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

    // 二进制转换为十进制: 整数部分的数值依次乘以2的幂次并逐个相加
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }    
        return result;
    }
}
// @lc code=end
