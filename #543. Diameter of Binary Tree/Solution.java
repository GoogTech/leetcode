/*
 * @Author: Goog Tech
 * @Date: 2020-10-27 13:34:28
 * @LastEditTime: 2020-10-27 13:35:13
 * @Description: https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * @FilePath: \leetcode-googtech\#543. Diameter of Binary Tree\Solution.java
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
    // 一条路径的长度为该路径经过的节点数减一,
    // 所以求直径(即求路径长度的最大值)等效于求路径经过节点数的最大值减一
    private int max = 0;

    // root的直径 = root左子树高度 + root右子树高度
    // root的高度 = max {root左子树高度, root右子树高度} + 1
    // 二叉树的直径不一定过根节点,因此需要去搜一遍所有子树
    // ( 例如以root, root.left, root.right..为根节点的树)对应的直径,取最大值
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    // DFS : 深度优先搜索
    private int dfs(TreeNode root) {
        // 判断当前节点是否为空
        if(root == null) return 0;
        // 递归获取左右子树孩子节点的高度
        int leftHeight = dfs(root.left), rightHeight = dfs(root.right);
        // 获取每个节点的最大直径(左子树深度 + 右子树深度),与当前最大值比较并取较大者
        max = Math.max(leftHeight + rightHeight, max);
        // 返回当前节点的深度
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
