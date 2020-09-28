/*
 * @Author: Goog Tech
 * @Date: 2020-09-28 11:46:32
 * @LastEditTime: 2020-09-28 11:47:16
 * @Description: https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
 * @FilePath: \leetcode-googtech\#124. Binary Tree Maximum Path Sum\Solution.java
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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMaxSum(root);
        return maxSum;
    }
    // 递归解法
    private int getMaxSum(TreeNode node) {
        // 判断节点是否为空
        if(node == null) return 0;
        // 递归计算当前节点的左右孩子节点,仅当最大贡献值 maxSum 大于 0 时,才会选取对应的节点
        int left = Math.max(getMaxSum(node.left), 0);
        int right = Math.max(getMaxSum(node.right), 0);
        // 节点的最大路径和取决于当前节点的值与该节点的左右子节点的最大贡献值
        maxSum = Math.max(node.val + left + right, maxSum);
        // 返回当前节点的最大贡献值
        return node.val + Math.max(left, right);
    }
}
