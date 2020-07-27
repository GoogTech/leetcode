/*
 * @Author: Goog Tech
 * @Date: 2020-07-26 21:18:04
 * @Description: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * @FilePath: \leetcode-googtech\#145. Binary Tree Postorder Traversal\Solution.java
 * @Reference: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/solution/bian-li-tong-jie-by-long_wotu/
 */ 

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
 */

// @lc code=start
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

    /**
     * 递归法
     */
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            result.add(root.val);
        }
        // [] + [3,2] + [1]
        return result;
    }

    /**
     * 迭代法:反转列表
     * 利用先序的遍历顺序:root->left->right,先将先序遍历更改为:root->right->left
     * 然后反转List,得到结果的顺序即为:left->right->root
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node  = stack.pop();
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
            // 逆序添加结点值
            result.add(0,node.val);
        }
        return result;
    }

    /**
     * 迭代法: 前中序非递归统一的写法
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // 初始化结果列表
        List<Integer> result = new ArrayList<>();
        // 判断头节点是否为空
        if(root == null) return result;
        // 初始化辅助栈
        Stack<TreeNode> stack = new Stack<>();
        // 初始化当前节点及当前节点的前节点,其用于区分之前的节点是否被访问过
        TreeNode currentNode = root, previousNode = null;
        // 遍历辅助栈
        while(!stack.isEmpty() || currentNode != null) {
            // 将左子树的左节点压入栈中
            while(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            // 弹出栈顶元素
            currentNode = stack.pop();
            // 判断是否有右孩子节点或左孩子节点是否被访问过了
            if(currentNode.right == null || currentNode.right == previousNode) {
                result.add(currentNode.val);
                previousNode = currentNode;
                currentNode = null;
            }else {
                stack.push(currentNode);
                currentNode = currentNode.right;
            }
        }  
        return result;
    }
}


// @lc code=end
