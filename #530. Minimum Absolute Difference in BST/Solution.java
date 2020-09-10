/*
 * @Author: Goog Tech
 * @Date: 2020-09-10 20:05:49
 * @LastEditTime: 2020-09-10 20:07:17
 * @Description: https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @FilePath: \leetcode-googtech\#530. Minimum Absolute Difference in BST\Solution.java
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

// 中序遍历: 根据搜索二叉树的特性,中序遍历会将树中节点数值从小到大顺序输出,所以 root.val > pre.val
// 进而只需要遍历计算相邻数值的差值,取其中最小值即可.
class Solution {
    private TreeNode pre = null;
    private int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return -1;
        inOrder(root);
        return minDiff;
    }
    private void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        if(pre != null) minDiff = Math.min(minDiff, root.val - pre.val);
        // if(pre != null) minDiff = Math.min(minDiff, Math.abs(pre.val - root.val));
        pre = root;
        inOrder(root.right);
    }
}
