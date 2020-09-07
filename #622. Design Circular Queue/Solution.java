/*
 * @Author: Goog Tech
 * @Date: 2020-09-07 08:16:03
 * @LastEditTime: 2020-09-07 08:16:33
 * @Description: https://leetcode-cn.com/problems/design-circular-queue/
 * @FilePath: \leetcode-googtech\#622. Design Circular Queue\Solution.java
 * @WebSite: https://algorithm.show/
 */

class MyCircularQueue {

    private int front; // 指向队头元素
    private int rear; // 指向队尾元素的下一个元素
    private int capacity; //声明数组容量
    private int[] array; // 使用数组实现循环队列

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        front = 0;
        rear = 0;
        capacity = k + 1;
        array = new int[capacity];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) return false;
        array[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) return false;
        front = (front + 1) % capacity;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) return -1;
        return array[front];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) return -1;
        return array[(rear - 1 + capacity) % capacity];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == rear;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        // 为了避免 “队列为空” 和 “队列为满” 的判别条件冲突,有意浪费一个元素空间
        // 即当 rear 循环到数组的前面,要从后面追上 front,还差一格的时判定为队列为满
        return (rear + 1) % capacity == front; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
