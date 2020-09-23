## 32 - III. 从上到下打印二叉树 III
> https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/


### Java
```java
/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 20:59:41
 * @LastEditTime: 2020-09-23 21:01:26
 * @Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#32 - III. 从上到下打印二叉树 III\Solution.java
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

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    // 递归算法
    public List<List<Integer>> levelOrder(TreeNode root) {
        helper(root, 0);
        return result;
    }
    private void helper(TreeNode root, int level) {
        // 判断当前节点是否为空
        if(root == null) return;
        // 若 result 结果集合的大小与二叉树的深度值 level 相等,则说明此时遍历到了一个新层
        if(result.size() == level) result.add(new ArrayList<>());
        // 若当前深度值 level 为偶数则将当前深度的节点值从右向左顺序存储,反之从左到右顺序存储
        if(level % 2 == 0) result.get(level).add(root.val);
        else result.get(level).add(0, root.val);
        // 递归遍历二叉树的左右子树
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}
```

### Python
```python
'''
Author: Goog Tech
Date: 2020-09-23 20:59:45
LastEditTime: 2020-09-23 21:00:19
Description: https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#32 - III. 从上到下打印二叉树 III\Solution.py
WebSite: https://algorithm.show/
'''

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    # BFS : 广度优先遍历
    # Python 中使用 collections 中的 deque() 作为双端队列,其中 popleft() 方法的时间复杂度为O(1),
    # 而列表 list 的 pop(0) 方法的时间复杂度为 O(N).
    # 注: Java 中将链表 LinkedList 作为双端队列使用.
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 判断根节点是否为空
        if not root: return []
        # 初始化列表及双端队列,并将 root 转化为列表后入队
        result, deque = [], collections.deque([root])
        # 循环遍历辅助队列中的节点
        while deque:
            # 初始化临时辅助队列,其用于存储二叉树当前层的节点
            temp = collections.deque()
            # 遍历队列中的节点
            for _ in range(len(deque)):
                # 将队首节点出队
                node = deque.popleft()
                # 若结果列表中的列表个数为偶数,则从右向左存储当前层节点
                if len(result) % 2: temp.appendleft(node.val)
                # 反之则从左向右存储当前层节点
                else: temp.append(node.val)
                # 将当前出队节点的左右孩子节点入队
                if node.left: deque.append(node.left)
                if node.right: deque.append(node.right)
            # 将当前深度的节点列表存储到结果列表中
            result.append(list(temp))
        # 返回结果列表
        return result
```
