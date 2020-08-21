/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 15:00:22
 * @LastEditTime: 2020-08-21 15:00:39
 * @Description: https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * @FilePath: \leetcode-googtech\#1342. Number of Steps to Reduce a Number to Zero\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        while(num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            steps++;
        }
        return steps;
    }
}
