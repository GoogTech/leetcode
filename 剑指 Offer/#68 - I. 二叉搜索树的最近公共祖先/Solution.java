/*
 * @Author: Goog Tech
 * @Date: 2020-09-27 19:25:19
 * @LastEditTime: 2020-09-27 19:25:39
 * @Description: https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#68 - I. 二叉搜索树的最近公共祖先\Solution.java
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
    // 利用搜索二叉树中每个节点都具备特性: 大于左子树上任意一个节点的值，小于右子树上任意一个节点的值
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 判断当前节点是否为空
        if(root == null) return null;
        // 若当前节点的值大于 q 与 p 的节点值,则说明 q 与 p 都在左子树
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        // 若当前节点的值小于 q 与 p 的节点值,则说明 q 与 p 都在右子树
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        // 反之则说明 q 与 p 分别在 root 节点的异侧,进而直接返回最近公共祖先 root 即可
        return root;
    }
}
