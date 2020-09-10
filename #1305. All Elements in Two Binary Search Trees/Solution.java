/*
 * @Author: Goog Tech
 * @Date: 2020-09-10 17:19:58
 * @LastEditTime: 2020-09-10 17:20:20
 * @Description: https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/
 * @FilePath: \leetcode-googtech\#1305. All Elements in Two Binary Search Trees\Solution.java
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
    List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        get(root1);
        get(root2);
        Collections.sort(result);
        return result;
    }
    // 利用递归对搜索二叉树进行中序遍历
    // 利用搜索二叉树的特性,该递归算法返回树中所有节点值的升序序列
    private void get(TreeNode root) {
        if(root != null) {
            result.add(root.val);
            get(root.left);
            get(root.right);
        }
    } 
}
