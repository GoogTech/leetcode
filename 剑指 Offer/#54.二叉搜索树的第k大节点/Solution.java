/*
 * @Author: Goog Tech
 * @Date: 2020-08-18 11:52:55
 * @LastEditTime: 2020-08-18 11:53:28
 * @Description: https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#54.二叉搜索树的第k大节点\Solution.java
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

    // 二叉搜索树的特性: 左孩子节点 < 根节点 < 右孩子节点
    public int kthLargest(TreeNode root, int k) {
        if(root == null || k < 1) return -1;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        // 返回第 k 大的节点
        return list.get(list.size() - k);
    }
    // 中序遍历二叉搜索树: 左->根->右, 可得到一个从小到大的序列
    private void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        if (root.left != null) helper(root.left, list);
        list.add(root.val);
        if (root.right != null) helper(root.right, list);
    }


    // 优化上述解法的空间复杂度
    private int result = 0, count = 0;
    public int kthLargest(TreeNode root, int k) {
        if(root == null || k < 1) return -1;
        helper(root, k);
        return result;
    }
    // 中序遍历的逆序遍历: 右->根->左, 可得到一个从大到小的序列
    private void helper(TreeNode root, int k) {
        if(root.right != null) helper(root.right, k);
        // 若当前遍历的节点个数等于 k 值即表明当前节点为第 k 大的节点
        if(++count == k) {
            result = root.val;
            return;
        }
        if(root.left != null) helper(root.left, k);
    }
}
