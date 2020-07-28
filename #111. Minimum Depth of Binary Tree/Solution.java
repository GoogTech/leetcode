/*
 * @Author: Goog Tech
 * @Date: 2020-07-28 22:30:45
 * @Description: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\111.二叉树的最小深度.java
 * @Reference: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/solution/li-jie-zhe-dao-ti-de-jie-shu-tiao-jian-by-user7208/
 */ 

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
     * 递归法，解题思路如下: 
     * 叶子节点的定义是左孩子和右孩子都为 null 时叫做叶子节点
     * 1. 当 root 节点左右孩子都为空时，返回 1
     * 2. 当 root 节点左右孩子有一个为空时，返回不为空的孩子节点的深度
     * 3. 当 root 节点左右孩子都不为空时，返回左右孩子较小深度的节点值
     */
    public int minDepth(TreeNode root) {
        // 判断头节点是否为空
        if(root == null)  return 0;
        // 若左右孩子都为空,则说明到达了叶子节点,直接返回1即可
        if(root.left == null && root.right == null) return 1;
        // 求出左右子树的深度值
        // 若左右孩子其中有一个为空,那么需返回比较大的那个孩子的深度值
        int lDepth = minDepth(root.left);
        int rDepth = minDepth(root.right);
        if(root.left == null || root.right == null) return lDepth + rDepth + 1; //有一个孩子必然为0，所以可以返回lDepth + rDepth + 1;
        // 若左右孩子都不为空,则返回最小深度加一即可
        return Math.min(lDepth,rDepth) + 1;
    }
}
// @lc code=end
