/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 09:40:02
 * @LastEditTime: 2020-07-29 09:45:44
 * @Description: https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\700.二叉搜索树中的搜索.java
 */ 

/*
 * @lc app=leetcode.cn id=700 lang=java
 *
 * [700] 二叉搜索树中的搜索
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
    /**
     * 二叉搜索树是一棵二叉树，每个节点都具备特性: 大于左子树上任意一个节点的值，小于右子树上任意一个节点的值。
     * 解题思路如下:
     * 1.如果根节点为空 root == null 或者根节点的值等于搜索值 val == root.val，返回根节点
     * 2.如果 val < root.val，进入根节点的左子树查找 searchBST(root.left, val)
     * 3.如果 val > root.val，进入根节点的右子树查找 searchBST(root.right, val)
     */
    public TreeNode searchBST(TreeNode root, int val) {
        // if(root == null || root.val == val) return root;
        // return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
        return root == null || root.val == val ? root : val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
// @lc code=end
