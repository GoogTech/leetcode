/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 21:07:13
 * @LastEditTime: 2020-08-14 21:24:18
 * @Description: https://leetcode-cn.com/problems/range-sum-of-bst/
 * @FilePath: \leetcode-googtech\#938. Range Sum of BST\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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

    /*
     * 二叉查找树,又被称为二叉搜索树. 其特点为: 左孩子均比父节点小,右孩子均比比父节点大.
     *
     * 算法实现的逻辑如下所示:
     *  当前节点为 null 时返回 0
     *  当前节点 X < L 时则返回右子树之和
     *  当前节点 X > R 时则返回左子树之和
     *  当前节点 X >= L 且 X <= R 时则返回: 当前节点值 + 左子树之和 + 右子树之和
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        if(root.val < L) return rangeSumBST(root.right, L, R);
        if(root.val > R) return rangeSumBST(root.left, L, R);
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
// @lc code=end
