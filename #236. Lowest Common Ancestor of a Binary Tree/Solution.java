/*
 * @Author: Goog Tech
 * @Date: 2020-09-27 17:40:11
 * @LastEditTime: 2020-09-27 17:41:51
 * @Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * @FilePath: \leetcode-googtech\#236. Lowest Common Ancestor of a Binary Tree\Solution.java
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
    // 递归解法 😵
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 若当前节点为空或等于 q 或 p,则直接返回 root
        if(root == null || root.val == p.val || root.val == q.val) return root;
        // 递归左右子树节点
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 若 left 和 right 都为空,则说明 q 与 p 分别在 root 的异侧,因此 root 为最近公共节点
        // 反之都为空则说明 root 的左右子树都不包含 q 与 p,进而返回 null 即可
        if(left != null && right != null) return root;
        // 若 left 为空而 right 不为空,则说明 p 与 q 都不在 root 的左子树中,直接返回 right 即可
        return left == null ? right : left;
    }
}
