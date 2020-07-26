/*
 * @Author: Goog Tech
 * @Date: 2020-07-26 17:46:02
 * @Description: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @FilePath: \leetcode-googtech\#144. Binary Tree Preorder Traversal\Solution.java
 */ 

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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

    // 迭代法: root->left->right
    public List<Integer> preorderTraversal(TreeNode root) {
        // 初始化辅助栈及用于存储结果的列表
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 判断头节点是否为空
        if(root == null) {
            return list;
        }
        // 将根节点压入栈中
        stack.push(root);
        // 重复操作:将栈中根节点弹出并存储到list中,然后将右及左节点压入栈中
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val); 
            // 根据Stack的特性,即FILO可知先弹出左节点
            if(root.right!=null) {
                stack.push(root.right);
            }
            if(root.left!=null) {
                stack.push(root.left);
            }
        }
        // 返回结果
        return list;
    }

    // 递归法1
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        helper(root.left, res);
        helper(root.right, res);
    }

    // 递归法2
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return list;
    }

}


// @lc code=end
