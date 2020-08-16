/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 17:27:08
 * @LastEditTime: 2020-08-16 17:47:02
 * @Description: https://leetcode-cn.com/problems/leaf-similar-trees/
 * @FilePath: \leetcode-googtech\#872. Leaf-Similar Trees\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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

    // DFS: 深度优先搜索
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // 判断两个二叉树的叶值序列是否相同
        String leftLeaf = dfs(root1, "");
        String rightLeaf = dfs(root2, "");
        return leftLeaf.equals(rightLeaf);
    }

    private String dfs(TreeNode root, String result) {
        // 判断当前节点是否为空
        if(root == null) return result;
        // 判断当前节点是否为叶子节点,若是则对其进行拼接
        if(root.left == null && root.right == null) {
            // 添加分隔符的目的: https://leetcode-cn.com/problems/leaf-similar-trees/comments/548544
            result += '-'; 
            result += result + root.val;
            return result;
        }
        // 递归遍历当前节点的左右孩子节点
        return dfs(root.left, result) + dfs(root.right, result);
    }
}
// @lc code=end
