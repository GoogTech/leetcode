/*
 * @Author: Goog Tech
 * @Date: 2020-09-01 19:24:29
 * @LastEditTime: 2020-09-01 19:24:40
 * @Description: https://leetcode-cn.com/problems/implement-stack-using-queues/
 * @FilePath: \leetcode-googtech\#225. Implement Stack using Queues\Solution.java
 * @WebSite: https://algorithm.show/
 */

class MyStack {

    // 声明辅助队列
    private Queue<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        // 初始化辅助队列
        queue = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        // 将当前元素入栈
        queue.offer(x);
        // 因入队顺序为先进先出,而栈则为先进后出,所以需要反转队列中的元素
        for(int i = queue.size() - 1; i > 0; i--) {
            queue.offer(queue.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // 弹出队列头元素
        return queue.poll();
    }
    
    /** Get the top element. */
    public int top() {
        // 获取队列头元素
        return queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        // 判断队列是否为空
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
