/*
 * @Author: Goog Tech
 * @Date: 2020-07-21 21:15:19
 * @Description: https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#55 - I. 二叉树的深度\Solution.java
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
    // 后序遍历(DFS): 递归法
    public int maxDepth(final TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 递归获取左右子树的深度
        final int leftDepth = maxDepth(root.left) + 1;
        final int rightDepth = maxDepth(root.right) + 1;
        // 利获取最大子树深度
        return leftDepth > rightDepth ? leftDepth:rightDepth;
    }
}
