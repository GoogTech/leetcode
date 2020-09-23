/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 21:08:32
 * @LastEditTime: 2020-09-23 21:09:52
 * @Description: https://leetcode-cn.com/problems/binary-tree-right-side-view/
 * @FilePath: \leetcode-googtech\#199. Binary Tree Right Side View\Solution.java
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
    // BFS : 广度优先搜索,即层次遍历
    public List<Integer> rightSideView(TreeNode root) {
        // 初始化结果数组集合
        List<Integer> result = new ArrayList<>();
        // 判断根节点是否为空
        if(root == null) return result;
        // 初始化双端辅助队列,并将根节点入队
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // 循环遍历队列中的节点
        while(!queue.isEmpty()) {
            // 获取队列中的节点数
            int size = queue.size();
            // 逐个遍历当前存储在队列中的上个深度层次的节点
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                // 将当前出队节点的孩子节点加入到队列中,即为下个深度的节点遍历做准备
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                // 每次将当前深度的最后一个节点,即最右边的节点加入到结果集合中
                if(i == size - 1) result.add(node.val);
            }
        }
        // 返回结果
        return result;
    }
}
