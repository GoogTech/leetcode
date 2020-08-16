/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 09:19:16
 * @LastEditTime: 2020-08-16 09:40:05
 * @Description: https://leetcode-cn.com/problems/invert-binary-tree/
 * @FilePath: \leetcode-googtech\#226. Invert Binary Tree\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */

// @lc code=start
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        // 判断当前节点是否为空
        if(root == null) return null;
        // 交换当前节点的左右孩子节点
        TreeNode tempNode = root.right;
        root.right = root.left;
        root.left = tempNode;
        // 递归交换当前节点的左右孩子节点
        invertTree(root.left);
        invertTree(root.right);
        // 函数返回时即表示当前节点及它的左右孩子都已交换完毕
        return root;
    }

}
// @lc code=end
