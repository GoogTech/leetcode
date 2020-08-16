/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 17:00:50
 * @LastEditTime: 2020-08-16 17:11:57
 * @Description: https://leetcode-cn.com/problems/binary-tree-paths/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\257.二叉树的所有路径.java
 * @WebSite: https://algorithm.show/
 */
/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        getPaths(root, "", paths);
        return paths;
    }

    private void getPaths(TreeNode root, String path, LinkedList<String> paths) {
        if(root !=null) {
            // 记录当前节点到叶子节点的路径
            path += Integer.toString(root.val);
            // 判断当前节点是否为叶子节点,若是则将其整体添加到 List 集合中
            if(root.left == null && root.right == null) {
                paths.add(path);
            // 反之则继续遍历当前节点的左右孩子节点
            }else {
                path += "->";
                getPaths(root.left, path, paths);
                getPaths(root.right, path, paths);
            }
        }
    }
}
// @lc code=end
