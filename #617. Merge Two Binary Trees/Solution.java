/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 08:34:34
 * @Description: https://leetcode-cn.com/problems/merge-two-binary-trees/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\617.合并二叉树.java
 */ 

/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
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
    // 迭代法
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // 若其中一棵树为空,则返回另一颗树作为结果
        if(t1 == null || t2 == null) return t1 == null ? t2 : t1;
        // 若两颗树当前节点都不为空,则将它们的值相加,并且对它们的左右孩子节点进行递归合并
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
// @lc code=end
