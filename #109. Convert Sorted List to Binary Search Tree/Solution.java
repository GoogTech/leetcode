/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 18:46:04
 * @LastEditTime: 2020-08-14 19:27:31
 * @Description: https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
 * @FilePath: \leetcode-googtech\#109. Convert Sorted List to Binary Search Tree\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    // 双指针法: 首先使用快慢指针求出链表的中点,然后通过中序遍历构建二叉树
    public TreeNode sortedListToBST(ListNode head) {
        return helper(head, null);
    }

    private TreeNode helper(ListNode head, ListNode tail) {
        if(head == tail) return null;
        // 初始化双指针
        ListNode fast = head;
        ListNode slow = head;
        // 寻找中间节点: 当快指针fast走到尾部时,慢指针slow指向链表的中间节点
        while(fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 使用中序遍历将其转换为二叉树(此时slow指向中间节点)
        TreeNode root = new TreeNode(slow.val);
        root.left = helper(head, slow); // 构建左子树
        root.right = helper(slow.next, tail); // 构建右子树
        return root;
    }
}
// @lc code=end
