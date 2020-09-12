/*
 * @Author: Goog Tech
 * @Date: 2020-09-12 10:47:14
 * @LastEditTime: 2020-09-12 10:49:35
 * @Description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * @FilePath: \leetcode-googtech\107. Binary Tree Level Order Traversal II\Solution.java
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
    // 广度优先遍历( DFS )
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 初始化结果列表
        LinkedList<List<Integer>> result = new LinkedList<>();
        // 判断根是否为空
        if(root == null) return result;
        // 初始化辅助队列,并将根节点入队
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // 判断当前辅助队列是否为空
        while(!queue.isEmpty()) {
            // 初始化用于存储当前层节点的临时列表
            List<Integer> oneLevel = new ArrayList<>();
            // 获取队列中上一层节点的个数
            int count  = queue.size();
            // 逐个遍历辅助队列中存储的上层节点
            for(int i = 0; i < count; i++) {
                // 将存储在队列中的上层节点逐个弹出,并将其存储到临时列表 oneLevel 中
                TreeNode node = queue.poll();
                oneLevel.add(node.val);
                // 若当前弹出节点的左右孩子节点不为空,则将其孩子节点继续添加列表中
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            // 每次循环结束后,将存储上层节点的临时列表添加到结果列表的头部
            result.addFirst(oneLevel);
        }
        // 返回结果列表
        return result;
    }
}
