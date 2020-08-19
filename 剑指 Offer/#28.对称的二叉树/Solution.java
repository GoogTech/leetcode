/*
 * @Author: Goog Tech
 * @Date: 2020-08-19 11:49:46
 * @LastEditTime: 2020-08-19 11:53:48
 * @Description: https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#28.对称的二叉树\Solution.java
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

    // 递归法
    public boolean isSymmetric(TreeNode root) {
        // 若根节点不为空则递归遍历左右子树根节点的孩子节点
        if(root == null) return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        // 若左右子树中的两孩子节点都为空则对称
        if(left == null && right == null) return true;
        // 若左右子树的两孩子节点其中有一个为空或这两节点的值不相同,则不对称
        if(left == null || right == null || left.val != right.val) return false;
        // 继续递归比较左右子树的孩子节点
        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}
