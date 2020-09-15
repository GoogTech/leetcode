/*
 * @Author: Goog Tech
 * @Date: 2020-09-15 10:53:49
 * @LastEditTime: 2020-09-15 10:54:29
 * @Description: https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/
 * @FilePath: \leetcode-googtech\#1315. Sum of Nodes with Even-Valued Grandparent\Solution.java
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
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, -1, -1);
    }
    private int dfs(TreeNode node, int parent, int grandparent) {
        if(node == null) return 0;
        int result = 0;
        if(grandparent % 2 == 0) result += node.val;
        result += dfs(node.left, node.val, parent);
        result += dfs(node.right, node.val, parent);
        return result;
    }
}
