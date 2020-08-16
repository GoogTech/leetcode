/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 12:23:26
 * @LastEditTime: 2020-08-16 12:30:19
 * @Description: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * @FilePath: \leetcode-googtech\#538. Convert BST to Greater Tree\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
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

    private int sum = 0;

    // 利用反序中序遍历解题,注: 二叉搜索树的左子树 < 根 < 右子树
    public TreeNode convertBST(TreeNode root) {
        if(root != null) {
            // 遍历右子树
            convertBST(root.right);
            // 对遍历到的每个节点值进行累加,并将其结果赋值给当前节点的值
            sum  = sum + root.val;
            root.val = sum;
            // 遍历左子树
            convertBST(root.left);
        }
        return root;
    }
}
// @lc code=end
