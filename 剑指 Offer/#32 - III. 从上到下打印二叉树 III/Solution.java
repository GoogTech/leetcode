/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 20:59:41
 * @LastEditTime: 2020-09-23 21:01:26
 * @Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#32 - III. 从上到下打印二叉树 III\Solution.java
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
    List<List<Integer>> result = new ArrayList<>();
    // 递归算法
    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return result;
    }
    private void helper(TreeNode root, int level) {
        // 判断当前节点是否为空
        if(root == null) return;
        // 若 result 结果集合的大小与二叉树的深度值 level 相等,则说明此时遍历到了一个新层
        if(result.size() == level) result.add(new ArrayList<>());
        // 若当前深度值 level 为偶数则将当前深度的节点值从右向左顺序存储,反之从左到右顺序存储
        if(level % 2 == 0) result.get(level).add(root.val);
        else result.get(level).add(0, root.val);
        // 递归遍历二叉树的左右子树
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}
