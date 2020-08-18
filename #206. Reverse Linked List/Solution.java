/*
 * @Author: Goog Tech
 * @Date: 2020-08-18 09:51:34
 * @LastEditTime: 2020-08-18 09:59:44
 * @Description: https://leetcode-cn.com/problems/reverse-linked-list/
 * @FilePath: \leetcode-googtech\#206. Reverse Linked List\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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

    // 双指针迭代法
    public ListNode reverseList(ListNode head) {
        // 初始化前后指针,其中临时指针用于辅助当前指针移动
        ListNode previousNode = null, currentNode = head, tempNode = null;
        // 循环遍历链表
        while(currentNode != null) {
            // 记录当前节点的下一个节点
            tempNode = currentNode.next;
            // 将当前节点指向前节点previousNode
            currentNode.next = previousNode;
            // 继续向后移动前后节点
            previousNode = currentNode;
            currentNode = tempNode;
        }
        // 当迭代完毕时currentNode指向null,而previousNode指向最后一个节点
        return previousNode;
    }
}
// @lc code=end
