/*
 * @Author: Goog Tech
 * @Date: 2020-09-15 11:16:43
 * @LastEditTime: 2020-09-15 11:17:26
 * @Description: https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/
 * @FilePath: \leetcode-googtech\#515. Find Largest Value in Each Tree Row\Solution.java
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
    // BFS : 深度优先遍历
    public List<Integer> largestValues(TreeNode root) {
        // 初始化辅助队列及结果列表
        Queue<TreeNode> queue = new LinkedList<>(); 
        List<Integer> values = new ArrayList<>();
        // 若二叉树不为空则将根节点入队
        if(root != null) queue.add(root);
        // 循环遍历队列
        while(!queue.isEmpty()) {
            // 初始化最小节点值
            int max = Integer.MIN_VALUE;
            // 获取二叉树中当前层的节点数
            int levelSize = queue.size(); 
            // 遍历队列中的元素
            for(int i = 0; i < levelSize; i++) {
                // 将队列中第一个元素出队
                TreeNode node = queue.poll();
                // 通过逐一比较,获取二叉树当前层中最大节点值
                max = Math.max(max, node.val);
                // 将当前出队节点的左右孩子节点入队
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            // 将当前层中最大节点值添加到结果列表中
            values.add(max);
        }
        // 返回结果
        return values;
    }
}
