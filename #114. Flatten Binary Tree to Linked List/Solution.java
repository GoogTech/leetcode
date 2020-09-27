/*
 * @Author: Goog Tech
 * @Date: 2020-09-27 17:47:29
 * @LastEditTime: 2020-09-27 17:48:43
 * @Description: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @FilePath: \leetcode-googtech\#114. Flatten Binary Tree to Linked List\Solution.java
 * @WebSite: https://algorithm.show/
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
    // 递归解法: 解题思路如下所示:
    // 1. 将左子树插入到右子树的地方
    // 2. 将原来的右子树接到左子树的最右边节点
    // 3. 考虑新的右子树的根节点,一直重复上面的过程,直到新的右子树为 null
    public void flatten(TreeNode root) {
       while(root != null) {
           // 若左子树为空,则直接考虑下一个节点
           if(root.left == null) {
               root = root.right;
           }else {
               // 找到左子树中最右边的节点
               TreeNode pre = root.left;
               while(pre.right != null) {
                   pre = pre.right;
               }
               // 将原来的右子树接到左子树中的最右边的节点上
               pre.right = root.right;
               // 将左子树插入到右子树的地方
               root.right = root.left;
               root.left = null;
               // 继续遍历下一个节点
               root = root.right;
           }
       }
    }
}
