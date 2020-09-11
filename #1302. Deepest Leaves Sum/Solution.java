/*
 * @Author: Goog Tech
 * @Date: 2020-09-11 15:42:07
 * @LastEditTime: 2020-09-11 15:42:32
 * @Description: https://leetcode-cn.com/problems/deepest-leaves-sum/
 * @FilePath: \leetcode-googtech\#1302. Deepest Leaves Sum\Solution.java
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
    
    // 解题思路: 利用辅助队列进行深度优先搜索,每次将上一次结果清零. 解题步骤如下所示:
    // 1. 一层层地遍历二叉树中的节点,将其逐个存储到 queue 中,并计算出每层节点之和
    // 2. 若还有下一层,则将存储在辅助队列中的上层节点全部清零
    // 3. 最后一次遍历后所得到的 sum 既是最深叶子节点的和
    public int deepestLeavesSum(TreeNode root) {
        // 判断根节点是否为空
        if(root == null) return 0;
        // 初始化辅助队列,其用于存储二叉树中每层的节点
        Queue<TreeNode> queue = new LinkedList<>();
        // 将根节点入队
        queue.offer(root);
        // 初始化最深叶子节点的和
        int sum = 0;
        // 判断当前辅助队列,即二叉树的下一层是否为空
        while(!queue.isEmpty()) {
            // 若二叉树还有下一层,则重新初始化最深叶子节点的和
            sum = 0;
            // 遍历存储在队列中的上层节点,并将其逐个出队
            for(int i = queue.size(); i > 0; i--) {
                TreeNode currentNode  = queue.poll();
                // 记录当前层节点的和
                sum += currentNode.val;
                // 将下一层节点入队
                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
            }
        }
        // 返回最深叶子节点的和
        return sum;
    }
}
