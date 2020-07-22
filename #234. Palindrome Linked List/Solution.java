/*
 * @Author: Goog Tech
 * @Date: 2020-07-22 17:45:44
 * @Description: https://leetcode-cn.com/problems/palindrome-linked-list/
 * @FilePath: \leetcode-googtech\#234. Palindrome Linked List\Solution.java
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
    // 双指针法
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        // 遍历链表元素并将其存储到数组列表
        ListNode currentNode = head;
        while(currentNode!=null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }
        // 同时移动头指针和尾指针并判断所指元素是否相等
        int front = 0,rear = list.size() - 1;
        while(rear > front) {
            if(!list.get(front).equals(list.get(rear))) {
                return false;
            }
            front++;
            rear--;
        }
        return true;
    }
}
