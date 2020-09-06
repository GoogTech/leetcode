/*
 * @Author: Goog Tech
 * @Date: 2020-09-06 21:04:04
 * @LastEditTime: 2020-09-06 21:04:36
 * @Description: https://leetcode-cn.com/problems/number-of-recent-calls/
 * @FilePath: \leetcode-googtech\#933. Number of Recent Calls\Solution.java
 * @WebSite: https://algorithm.show/
 */

// 解题关键点 : 因只需考虑最近 3000 毫秒到现在时间 t 的 ping 数,
// 所以我们可以使用队列来存储这些 ping 的记录,当收到一个时间 t 的 ping 时,
// 我们将它加入队列,并且将所有在时间 t - 3000 之前的 ping 移出队列.
class RecentCounter {

    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t - 3000) queue.poll();
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
