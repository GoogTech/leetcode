/*
 * @Author: Goog Tech
 * @Date: 2020-07-27 10:56:38
 * @Description: #94 #144 #145: Binary Tree Traversal Template
 * @FilePath: \leetcode-googtech\#94 #144 #145 Binary Tree Traversal Template\Template.java
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

    /**
     * 前序遍历:递归法
     */
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<Integer>();
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }

    /**
     * 中序遍历:递归法
     */
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }

    /**
     * 后续遍历:递归法
     */
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }

    /**
     * 前序遍历:迭代法一
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<Integer>();
        // 声明辅助栈及结果链表
        TreeNode currentNode  = root;
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 循环遍历辅助栈
        while(currentNode != null || !stack.isEmpty()) {
            // 将左孩子节点压入栈中并存储到结果链表中
            while(currentNode != null) {
                stack.push(currentNode);
                result.add(currentNode.val);
                currentNode = currentNode.left;
            }
            // 更新当前节点为其右孩子节点,进入下一个循环
            currentNode = stack.pop();
            currentNode = node.right;
        }
        return result;
    }

    /**
     * 中序遍历:迭代法一
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<>();
        // 声明辅助栈及结果链表
        TreeNode currentNode = root;
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 循环遍历辅助栈
        while(currentNode != null || !stack.isEmpty()) {
            // 将左孩子节点压入栈中
            while(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            // 出栈并将其存储到结果链表中
            currentNode = stack.pop();
            result.add(currentNode.val);
            // 更新当前节点为右孩子节点,进入下一个循环
            currentNode = currentNode.right;
        }
        return result;
    }

    /**
     * 后序遍历:迭代法一
     * 在后序遍历中每个节点需要访问两次,即当遍历完左子树后需要访问当前节点,
     * 之后遍历完右子树后还需要访问当前节点,但只有在第二次访问时才处理当前节点.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<Integer>();
        // previousNode为当前节点的前一个节点,用于区分之前的节点是否被访问过
        TreeNode currentNode = root;
        TreeNode previousNode = null;
        // 声明辅助栈及结果链表
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        // 循环遍历辅助栈
        while(currentNode != null || !stack.isEmpty()) {
            while(currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            // 更新当前节点为用户栈出栈节点
            currentNode = stack.pop();
            // 当右孩子为空及右孩子被访问过时,访问当前节点,更新当前节点为空,为下一步的出栈作准备
            if(currentNode.right == null || currentNode.right == previousNode) {
                result.add(currentNode.val);
                previousNode = currentNode;
                currentNode = null;
            }else {
                // 更新当前节点为右孩子节点
                stack.push(currentNode);
                currentNode = currentNode.right;
            }
        }
        return result;
    }

    /**
     * 前序遍历:迭代法二
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<Integer>();
        TreeNode currentNode = null;
        // 初始化辅助栈及结果链表
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 将根节点压入栈中
        stack.push(root);
        // 重复操作:将栈中节点弹出并存储到list中,然后将右及左节点压入栈中
        while(!stack.isEmpty()) {
            currentNode = stack.pop();
            result.add(currentNode.val);
            // 根据Stack的特性,即FILO可知先弹出左节点
            if(currentNode.right != null) stack.push(currentNode.right);
            if(currentNode.left != null) stack.push(currentNode.left);
        }
        return result;
    }

    /**
     * 后续遍历:迭代法二
     * 利用先序的遍历顺序:root=>left->right,先将先序遍历更改为:root->right->left
     * 然后反转List,得到的结果的顺序即为:left->right->root
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<Integer>();
        TreeNode currentNode = null;
        // 初始化辅助栈及结果链表
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        // 将根节点压入栈中
        stack.push(root);
        // 重复操作:将栈中节点弹出并存储到list中,然后将左及右节点压入栈中
        while(!stack.isEmpty()) {
            currentNode = stack.pop(); 
            // 逆序添加节点值
            result.add(0,currentNode.val); 
            // 根据Stack的特性,即FILO可知先弹出右节点
            if(currentNode.left != null) stack.push(currentNode.left);
            if(currentNode.right != null) stack.push(currentNode.right);
        }
        return result;
    }
}
