/*
 * @Author: Goog Tech
 * @Date: 2020-07-28 21:27:08
 * @Description: https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\559.n叉树的最大深度.java
 */ 

/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N叉树的最大深度
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
    // 递归法
    public int maxDepth(Node root) {
        // 判断根节点是否为空或无孩子节点
        if(root == null) return 0;
        if(root.children == null) return 1;
        // 初始化最大深度值及当前子树的深度值
        int maxDepth = 0, currentDepth = 0;
        // 遍历当前节点的子节点,即求出当前子树的深度值
        for(Node node : root.children) {
            currentDepth = maxDepth(node);
            // 判断当前子树的深度是否为最大深度值
            maxDepth =currentDepth > maxDepth ? currentDepth : maxDepth;
        }
        // 一棵树的最大深度就是子树最大深度加一
        return maxDepth + 1;
    }
}


// @lc code=end
