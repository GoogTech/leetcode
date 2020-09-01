/*
 * @Author: Goog Tech
 * @Date: 2020-09-01 21:57:05
 * @LastEditTime: 2020-09-01 21:57:17
 * @Description: https://leetcode-cn.com/problems/min-stack/
 * @FilePath: \leetcode-googtech\#155. Min Stack\Solution.java
 * @WebSite: https://algorithm.show/
 */

class MinStack {

    // 声明两个辅助栈,其中 stack 用于存储元素,而 minStack 仅用于存储 stack 中的最小元素
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        // 初始化辅助栈
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int x) {
        // 将元素压入 stack 栈中
        stack.push(x);
        // 若当前 minStack 为空或其顶部元素小于或等于当前压入的元素 x,则将 x 压入 minStack 栈中
        if(minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }
    
    public void pop() {
        // 弹出 stack 栈的顶部元素,若其与 minStack 栈的顶部元素相同,则也弹出 minStack 栈的顶部元素
        // 进而可以保证 minStack 的栈顶元素始终是 stack 栈中的最小值
        if(stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }
    
    public int top() {
        // 获取 stack 栈的顶部元素
        return stack.peek();
    }
    
    public int getMin() {
        // 获取 minStack 栈的顶部元素,即所压入元素的最小值
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
