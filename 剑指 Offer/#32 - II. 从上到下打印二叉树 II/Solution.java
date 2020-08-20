/*
 * @Author: Goog Tech
 * @Date: 2020-08-20 11:06:00
 * @LastEditTime: 2020-08-20 11:06:34
 * @Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#32 - II. 从上到下打印二叉树 II\Solution.java
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
    // BFS: 使用队列实现二叉树的层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        // 初始化用于存储结果的 list 集合
        List<List<Integer>> result = new ArrayList<>();
        // 初始化辅助队列
        Queue<TreeNode> queue = new LinkedList<>();
        // 判断头节点是否为空
        if(root != null) queue.add(root);
        // 循环遍历队列
        while(!queue.isEmpty()) {
            // root非空时,第一层的节点数为一
            int n = queue.size();
            // 初始化用于存储每层节点的 list 集合
            List<Integer> list = new ArrayList<>();
            // 进行 n 次循环,确保当前层的节点全部出队列
            for(int i = 0; i < n; i++) {
                root = queue.poll();
                // 将该层的节点存储到 list 结合中
                list.add(root.val);
                // 把当前节点所有的孩子节点全部加入队列中,进而确保当前队列的 size 就是下一层的节点数
                if(root.left != null) queue.add(root.left);
                if(root.right != null) queue.add(root.right);
            }
            // 将每层的节点列表加入到结果列表中
            result.add(list);
        }
        // 返回结果
        return result;
    }
}
