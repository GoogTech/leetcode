/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 12:49:06
 * @LastEditTime: 2020-07-29 15:05:17
 * @Description: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * @FilePath: \leetcode-googtech\#590. N-ary Tree Postorder Traversal\590.n叉树的后序遍历.java
 */ 

/*
 * @lc app=leetcode.cn id=590 lang=java
 *
 * [590] N叉树的后序遍历
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

    /**
     * 递归法
     */
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<>();
        // 递归根节点的左右孩子节点,将其添加到结果队列中
        for(Node children : root.children) {
            postorder(children);
        }
        // 将根节点添加到结果队列中
        result.add(root.val);
        // 返回结果队列
        return result;
    }

    /**
     * 迭代法: 双端队列 + 辅助栈
     */
    public List<Integer> postorder(Node root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<>();
        // 初始化结果队列(双端队列)及辅助栈
        LinkedList<Integer> result = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        // 将根节点压入栈中
        stack.push(root);
        // 循环遍历辅助栈
        while(!stack.isEmpty()) {
            // 每次循环将栈顶元素弹出
            Node currentNode = stack.pop();
            // 将栈顶元素存储到双端队列的头部(存储顺序: 根节点->右节点->左节点)
            result.addFirst(currentNode.val);
            // 然后将栈顶元素的孩子节点从左至右顺序入栈(出栈顺序: 从右至左)
            if(currentNode.children != null) {
                for(Node children : currentNode.children) {
                    stack.push(children);
                }
            }
        }
        // 返回结果队列
        return result;
    }

    /**
     * 迭代法: 数组队列 + 辅助栈
     */
    public List<Integer> postorder(Node root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<>();
        // 初始化结果队列(数组队列)及辅助栈
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        // 将根节点压入栈中
        stack.push(root);
        // 循环遍历辅助栈
        while(!stack.isEmpty()) {
            // 每次循环获取并删除栈尾元素
            Node currentNode = stack.remove(stack.size() - 1); 
            // 将栈尾元素存储到数组队列中(根节点->右节点->左节点)
            result.add(currentNode.val);
            // 然后将栈尾元素的孩子节点从左至右顺序入栈,所以栈尾元素为右节点
            if(currentNode.children != null) {
                for(Node children : currentNode.children) {
                    stack.push(children);
                }
            }
        }
        // 将结果队列反转并返回
        Collections.reverse(result);
        return result;
    }
}
// @lc code=end
