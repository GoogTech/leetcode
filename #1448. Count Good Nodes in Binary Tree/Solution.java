/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 21:53:11
 * @LastEditTime: 2020-09-23 21:54:08
 * @Description: https://leetcode-cn.com/problems/count-good-nodes-in-binary-tree/
 * @FilePath: \leetcode-googtech\#1448. Count Good Nodes in Binary Tree\Solution.java
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
    private int result = 0;

    // DFS : 深度优先搜索
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return result;
    }
    private void dfs(TreeNode node, int max) {
        if(node == null) return;
        if(node.val >= max) {
            max = node.val;
            result++;
        }
        dfs(node.left, max);
        dfs(node.right, max);
    }
}
