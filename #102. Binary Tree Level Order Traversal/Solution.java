/*
 * @Author: Goog Tech
 * @Date: 2020-07-26 11:32:01
 * @Description: In User Settings Edit
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.java
 * @Reference: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/solution/bfs-de-shi-yong-chang-jing-zong-jie-ceng-xu-bian-l/
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
    // Breadth First Search:使用队列实现二叉树的层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 存储结果
        List<List<Integer>> result = new ArrayList<>();
        // 辅助队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 判断头节点是否为空
        if(root != null) {
            queue.add(root);
        }
        // 遍历队列
        while(!queue.isEmpty()) {
            // root非空时,第一层的节点数为1
            int n = queue.size(); 
            // 存储每层的节点
            List<Integer> list = new ArrayList<>();
            // 进行n次循环,确保当前层的节点全部出队列
            for(int i = 0;i < n;i++) {
                root = queue.poll();
                // 存储该层节点
                list.add(root.val);
                // 把当前节点所有的左右节点全部加入队列,进而确当前保队列的size就是下一层的节点数
                if(root.left != null) {
                    queue.add(root.left);
                }
                if(root.right !=null) {
                    queue.add(root.right);
                }
            }
            // 将每层的节点列表加入结果列表中
            result.add(list); 
        }
        // 返回结果
        return result;
    }
}
