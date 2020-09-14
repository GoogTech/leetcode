/*
 * @Author: Goog Tech
 * @Date: 2020-09-14 17:25:33
 * @LastEditTime: 2020-09-14 17:27:19
 * @Description: https://leetcode-cn.com/problems/balanced-binary-tree/
 * @FilePath: \leetcode-googtech\#110. Balanced Binary Tree\Solution.java
 * @WebSite: https://algorithm.show/
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

    boolean result = true;

    // BFS : 深度优先遍历
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return result;
    }
    private int dfs(TreeNode root) {
        if(root == null) return 0;
        int lDepth = dfs(root.left);
        int rDepth = dfs(root.right);
        if(Math.abs(lDepth - rDepth) > 1) result = false;
        return Math.max(lDepth, rDepth) + 1;
    }
}
