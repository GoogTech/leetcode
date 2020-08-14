/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 20:41:56
 * @LastEditTime: 2020-08-14 20:52:29
 * @Description: https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * @FilePath: \leetcode-googtech\#108. Convert Sorted Array to Binary Search Tree\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if(left > right) return null;
        // 获取数组中间元素的下标值,并将该元素作为二叉树的根节点
        int midNodeIndex = (left + right) / 2;
        TreeNode root = new TreeNode(nums[midNodeIndex]);
        // 左侧数组作为左子树,同理右侧数组作为右子树
        root.left = helper(nums, left, midNodeIndex - 1);
        root.right = helper(nums, midNodeIndex + 1, right);
        // 返回结果
        return root;
    }
}
// @lc code=end
