/*
 * @Author: Goog Tech
 * @Date: 2020-07-29 11:07:57
 * @LastEditTime: 2020-07-29 11:51:42
 * @Description: https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 * @FilePath: \leetcode-googtech\#589. N-ary Tree Preorder Traversal\589.n叉树的前序遍历.java
 */ 

/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N叉树的前序遍历
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
    private List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
        result.add(root.val);
        for(Node children : root.children) preorder(children);
        return result;
    }

    /**
     * 迭代法
     */
    public List<Integer> preorder(Node root) {
        // 判断头节点是否为空
        if(root == null) return new ArrayList<Integer>();
        // 初始化辅助栈及结果列表
        Stack<Node> stack = new Stack<>();
        List<Integer> result = new LinkedList<>();
        // 将根节点压入栈中
        stack.push(root);
        // 循环遍历辅助栈
        while(!stack.isEmpty()) {
            // 每次循环将栈顶元素出栈
            root = stack.pop();
            // 将栈顶元素存储到结果列表中
            result.add(root.val);
            // 然后将栈顶元素的孩子节点从右至左压入栈中(出栈顺序:从左至右)
            if(!root.children.isEmpty()) {
                for(int i = root.children.size() - 1; i >= 0; i--) {
                    stack.push(root.children.get(i));
                }
            }
        }
        // 返回结果列表
        return result;
    }
}
// @lc code=end
