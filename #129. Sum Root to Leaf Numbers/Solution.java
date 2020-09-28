/*
 * @Author: Goog Tech
 * @Date: 2020-09-28 11:44:06
 * @LastEditTime: 2020-09-28 11:44:26
 * @Description: https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 * @FilePath: \leetcode-googtech\#129. Sum Root to Leaf Numbers\Solution.java
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
    // 递归解法
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    private int helper(TreeNode node, int sum) {
        if(node == null) return 0;
        // 若当前节点是叶子结点,则说明找到了一条路径
        if(node.left == null && node.right == null) return 10 * sum + node.val;
        // 反之继续遍历子节点, 即将子节点和子节点的值分别加入到递归栈中,其中子节点的值 = 父节点的值 * 10 + 当前节点的值
        return helper(node.left, 10 * sum + node.val) + helper(node.right, 10 * sum + node.val);
    }
}
