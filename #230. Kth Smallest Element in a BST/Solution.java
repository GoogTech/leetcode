/*
 * @Author: Goog Tech
 * @Date: 2020-08-18 12:35:53
 * @LastEditTime: 2020-08-18 12:36:14
 * @Description: https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * @FilePath: \leetcode-googtech\#230. Kth Smallest Element in a BST\Solution.java
 * @WebSite: https://algorithm.show/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    // 中序遍历: 左->根->右, 可得到一个从小到大的序列
    // 搜索二叉树的特性为: 左孩子节点 < 根节点 < 右孩子节点
    private int result = 0, count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null || k < 1) return -1;
        helper(root, k);
        return result;
    }

    // 中序遍历
    private void helper(TreeNode root, int k) {
        if(root.left != null) helper(root.left, k);
        // 若当前遍历的节点个数等于 k 值即表明当前节点为第 k 小的节点
        if(++count == k) {
            result = root.val;
            return;
        }
        if(root.right != null) helper(root.right, k);
    }
}
