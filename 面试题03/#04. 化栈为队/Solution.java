/*
 * @Author: Goog Tech
 * @Date: 2020-08-31 16:17:16
 * @LastEditTime: 2020-08-31 16:20:02
 * @Description: https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/
 * @FilePath: \leetcode-googtech\面试题03\#04. 化栈为队\Solution.java
 * @WebSite: https://algorithm.show/
 */

// 解题思路: 每次入队时把数据压入 StackWrite,
// 每次读数据时先将 StackWrite 中的数据压入到 StackRead,
// 这时 StackRead 中的栈顶元素就是我们所期望的队首元素咯
// refer to: https://leetcode-cn.com/problems/implement-queue-using-stacks-lcci/comments/319121

class MyQueue {

    // 声明两个辅助栈,其分别用于存储与读取数据
    Stack<Integer> stackWrite;
    Stack<Integer> stackRead;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackWrite = new Stack<>();
        stackRead = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackWrite.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // 在出队的时要注意一点: 如果 StackRead 中有数据,那么就直接取 StackRead 的栈顶元素
        // 如果 StackRead 为空则先将 StackWrite 中的元素压入 StackRead 中,再取 StackRead 的栈顶元素
        peek();
        return stackRead.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stackRead.isEmpty()) return stackRead.peek();
        while(!stackWrite.isEmpty()) stackRead.push(stackWrite.pop());
        return stackRead.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackRead.isEmpty() && stackWrite.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
