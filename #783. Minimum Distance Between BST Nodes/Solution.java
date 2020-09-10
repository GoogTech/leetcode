/*
 * @Author: Goog Tech
 * @Date: 2020-09-10 17:58:45
 * @LastEditTime: 2020-09-10 17:59:01
 * @Description: https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 * @FilePath: \leetcode-googtech\#783. Minimum Distance Between BST Nodes\Solution.java
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

// 中序遍历: 根据搜索二叉树的特性,中序遍历会将树中节点数值从小到大顺序输出,
// 进而只需要遍历计算相邻数的差值,取其中最小值即可.
class Solution {
    private TreeNode pre = null;
    private int minDiff = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root == null) return -1;
        inOrder(root);
        return minDiff;
    }
    private void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        if(pre != null) minDiff = Math.min(minDiff, root.val - pre.val);
        pre = root;
        inOrder(root.right);
    }
}
