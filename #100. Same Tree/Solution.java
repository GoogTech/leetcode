/*
 * @Author: Goog Tech
 * @Date: 2020-07-24 19:08:50
 * @Description: https://leetcode-cn.com/problems/same-tree/
 * @FilePath: \leetcode-googtech\#100. Same Tree\Solution.java
 */ 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // 递归法
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        else if(p!=null && q!=null && p.val == q.val) {
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
}
