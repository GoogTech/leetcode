/*
 * @Author: Goog Tech
 * @Date: 2020-07-25 18:53:10
 * @Description: https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * @FilePath: \leetcode-googtech\#222. Count Complete Tree Nodes\Solution.java
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
    
    // 递归法
    // 1.通过遍历每个结点的左孩子先分别求出左子树和右子树的高度
    // 2.如果leftHeight == rightHeight则说明左子树一定是满二叉树,此时求出左子树的节点总数加上当前子树的根节点,
    //   共计 2^leftHeight 个,而右子树中的节点个数可以通过递归获取
    // 3.如果left != right则说明最后一层不满,但倒数第二层已经满了,此时求出右子树的节点总数加上当前子树的根节点,
    //   共计 2^rightHeight 个,而左子树中的节点个数可以通过递归获取
    public int countNodes(TreeNode root) {
        // 判断头节点是否为空
        if(root == null) {
            return 0;
        }
        // 获取左右子树的高度
        int leftHeight = count(root.left),rightHeight = count(root.right);
        // 若左右子树的高度相同则说明左子树为满二叉树,其节点数为 2^leftHeight-1 个,而右子树中节点个数可以通过递归获得
        // 总数 = 左子树节点个数 + 根节点 + 右子树节点个数(1 << leftHeight == 2 ^ leftHeight)
        if( leftHeight == rightHeight) {
             return (1 << leftHeight) + countNodes(root.right); 
        }else{
            // 反之则代表最后一层不满(倒数第二层是满的),此时右子树上的节点数为 2^rightHeight 个,而左子树上的节点可以通过递归获得
            // 总数 = 右子树节点个数 + 根节点 + 左子树节点个数(1 << rightHeight == 2 ^ leftHeight)
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    // 获取完全二叉树中左右子树的高度
    private int count(TreeNode node) {
        int level = 0;
        // 根据完全二叉树的性质可知,若左子树不为空则其高度可加1
        while(node != null) {
            level ++;
            node = node.left;
        }
        return level;
    }
}
