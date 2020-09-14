/*
 * @Author: Goog Tech
 * @Date: 2020-09-14 17:56:04
 * @LastEditTime: 2020-09-14 17:56:39
 * @Description: https://leetcode-cn.com/problems/find-bottom-left-tree-value/
 * @FilePath: \leetcode-googtech\#513. Find Bottom Left Tree Value\Solution.java
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
    
    // BFS : 广度优先遍历
    // 解题思路 : 通常 BFS 遍历都是从上到下,从左到右,
    // 然而根据题目要求,故采用先上后下,先右后左的遍历策略,
    // 进而最后一个元素必然是最下方最左边的元素,最后将该节点的值 node.val 返回即可.
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            root = queue.poll();
            if(root.right != null) queue.offer(root.right);
            if(root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
}
