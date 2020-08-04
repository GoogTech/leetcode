/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 16:43:22
 * @LastEditTime: 2020-08-04 16:44:19
 * @Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#32 - I. 从上到下打印二叉树\Solution.java
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
    // BFS
    public int[] levelOrder(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new int[0];
        // 初始化辅助队列,通过BFS实现层次遍历二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        // 初始化动态数组,用于存储节点值
        ArrayList<Integer> list = new ArrayList<>();
        // 根节点先入队
        queue.add(root);
        // 循环弹出队首节点,将其值存储到list,后将其孩子节点入队
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            list.add(currentNode.val);
            if(currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        // 将 ArrayList 转换为 int 数组并返回
        int [] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
