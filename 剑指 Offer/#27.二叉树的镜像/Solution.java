/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 10:55:34
 * @LastEditTime: 2020-08-09 10:56:24
 * @Description: https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#27.二叉树的镜像\Solution.java
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
    public TreeNode mirrorTree(TreeNode root) {
        // 判断根节点是否为空
        if(root == null) return null;
        // 初始化二叉树镜像
        TreeNode result = new TreeNode(root.val);
        // 递归交换左右子树的孩子节点
        result.left = mirrorTree(root.right);
        result.right = mirrorTree(root.left);
        // 返回结果
        return result;
    }
}
