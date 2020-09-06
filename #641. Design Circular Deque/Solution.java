/*
 * @Author: Goog Tech
 * @Date: 2020-09-06 22:26:24
 * @LastEditTime: 2020-09-06 22:27:19
 * @Description: https://leetcode-cn.com/problems/design-circular-deque/
 * @FilePath: \leetcode-googtech\#641. Design Circular Deque\Solution.java
 * @WebSite: https://algorithm.show/
 */

class MyCircularDeque {

    private int[] elements;
    // int是基础数据类型,初始值是 0,它对应的有一种引用类型叫做 Integer 类,没初始化时是 null
    private int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        elements = new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) return false;
        for(int i = size - 1; i >= 0; i--) elements[i + 1] = elements[i];
        elements[0] = value;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) return false;
        elements[size] = value;
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) return false;
        elements[0] = 0;
        for(int i = 0; i < size - 1;i++) elements[i] = elements[i + 1];
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) return false;
        elements[size - 1] = 0;
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        return size  == 0 ? -1 : elements[0];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        return size == 0 ? -1 : elements[size - 1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == elements.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
