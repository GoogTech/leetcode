/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 09:51:18
 * @LastEditTime: 2020-07-29 10:29:48
 * @Description: https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\429.n叉树的层序遍历.java
 */ 

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    // BFS: 利用队列实现广度优先搜索
    public List<List<Integer>> levelOrder(Node root) {
        // 初始化辅助队列和结果列表
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        // 若头节点不为空则将其压入辅助队列中
        if(root != null) queue.add(root);
        // 循环遍历辅助队列
        while(!queue.isEmpty()) {
            // 初始化辅助节点,用于将当前出队节点存储到结果列表中
            List<Integer> temp = new ArrayList<>();
            // 将辅助队列中的节点依次出队,并将其孩子节点依次入队
            for(int i = queue.size(); i > 0; i--) {
                Node node = queue.poll();
                if(node != null) {
                    temp.add(node.val);
                    for(Node children : node.children) { 
                        queue.add(children); // queue.addAll(node.children);
                    }
                }
            }
            // 存储辅助队列中当前出队的节点
            result.add(temp);
        }
        // 返回结果列表
        return result;
    }
}
// @lc code=end
