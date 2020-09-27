/*
 * @Author: Goog Tech
 * @Date: 2020-09-27 17:55:31
 * @LastEditTime: 2020-09-27 17:55:57
 * @Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves/
 * @FilePath: \leetcode-googtech\#1123. Lowest Common Ancestor of Deepest Leaves\Solution.java
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
    // DFS : 深度优先遍历
    // 如果左右子树高度相等,则当前结点为要找的结点
    // 否则要找的结点在高度较大的子树中,进而自底向上的计算高度并返回寻找到的结点
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root == null) return null;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return leftDepth == rightDepth ? root : leftDepth > rightDepth ? lcaDeepestLeaves(root.left) : lcaDeepestLeaves(root.right);
    }
    private int depth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
