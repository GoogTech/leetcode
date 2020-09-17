/*
 * @Author: Goog Tech
 * @Date: 2020-09-17 12:30:07
 * @LastEditTime: 2020-09-17 12:32:43
 * @Description: https://leetcode-cn.com/problems/list-of-depth-lcci/
 * @FilePath: \leetcode-googtech\面试题04\#03. 特定深度节点链表\Solution.java
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

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    // BFS : 广度优先搜索,即层次遍历
    public ListNode[] listOfDepth(TreeNode tree) {
        // 判断头节点是否为空
        if(tree == null) return new ListNode[0];
        // 初始化辅助队列,并将根节点入队
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(tree);
        // 初始化链表集合
        List<ListNode> list = new ArrayList<>();
        // 初始化链表虚拟头节点
        ListNode dummyHead = new ListNode(-1); 
        while(!queue.isEmpty()) {
            // 初始化链表虚拟头节点的指针
            ListNode prev = dummyHead;
            // 获取当前队列中的节点数,即二叉树当前深度所有的节点数
            int size = queue.size();
            // 遍历队列中的节点
            for(int i = 0; i < size; i++) {
                // 获取队首节点
                TreeNode node  = queue.poll(); // or tree = queue.poll();
                // 将链表虚拟头节点的指针指向当前出队节点,即将其作为下一个节点
                prev.next = new ListNode(node.val);
                prev = prev.next;
                // 若当前出队节点的左右孩子不为空,则将其入队,进而对下个深度的节点进行遍历
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            // 将二叉树当前深度的节点所构成的链表添加到临时列表中
            list.add(dummyHead.next);
        }
        // 将临时列表中的元素存储到结果数组中,然后返回其结果
        ListNode[] result = new ListNode[list.size()];
        for(int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }
}
