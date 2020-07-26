/*
 * @Author: Goog Tech
 * @Date: 2020-07-26 21:00:03
 * @Description: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/comments/
 * @FilePath: \leetcode-googtech\#94. Binary Tree Inorder Traversal\Solution.java
 */

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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

    // 递归法
    // List<Integer> list = new ArrayList<>();
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     if(root != null) {
    //         inorderTraversal(root.left);
    //         list.add(root.val);
    //         inorderTraversal(root.right);
    //     }
    //     // [] + [1] + [3,2]
    //     return list;
    // }

    // 迭代法
    public List<Integer> inorderTraversal(TreeNode root) {
        // 初始化辅助栈及结果列表
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new LinkedList<>();
        // 判断头节点是否为空
        if(root == null) return result;
        // 遍历辅助栈
        while(root != null || !stack.isEmpty()) {
            // 遍历根节点的左孩子节点并将其依次压入栈中,直到为空然后进入操作2
            if(root != null) { // 操作1
                stack.push(root);
                root = root.left;
            // 弹出栈顶元素,若其有右孩子,则将右孩子节点压入栈中,随后重复操作1
            }else { // 操作2
                root = stack.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
    }
}


// @lc code=end
