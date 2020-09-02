/*
 * @Author: Goog Tech
 * @Date: 2020-09-02 21:59:27
 * @LastEditTime: 2020-09-02 21:59:46
 * @Description: https://leetcode-cn.com/problems/design-a-stack-with-increment-operation/
 * @FilePath: \leetcode-googtech\#1381. Design a Stack With Increment Operation\Solution.java
 * @WebSite: https://algorithm.show/
 */

// 使用数组模拟栈结构
class CustomStack {

    int[] stack;
    int index;
    
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        index = -1;
    }
    
    public void push(int x) {
        if(index == stack.length - 1) return;
        stack[++index] = x;
    }
    
    public int pop() {
        return index == -1 ? -1 : stack[index--];
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, index + 1); i++) stack[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
