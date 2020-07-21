/*
 * @Author: Goog Tech
 * @Date: 2020-07-21 21:48:51
 * @Description: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @FilePath: \leetcode-googtech\#104. Maximum Depth of Binary Tree\Solution.java
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
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
