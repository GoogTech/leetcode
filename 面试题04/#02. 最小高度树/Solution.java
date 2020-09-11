/*
 * @Author: Goog Tech
 * @Date: 2020-09-11 08:40:06
 * @LastEditTime: 2020-09-11 08:41:06
 * @Description: https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 * @FilePath: \leetcode-googtech\面试题04\#02. 最小高度树\Solution.java
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
    // 将数组中间的元素作为根节点,然后以中间为分界点分别对左边及右边的子数组进行递归,
    // 最后返回的是左右子树的根节点,然后令其等于 root.left 及 root.right 即可.
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        return root;
    }
}
