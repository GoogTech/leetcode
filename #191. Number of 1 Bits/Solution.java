/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 10:07:51
 * @LastEditTime: 2020-08-16 10:08:33
 * @Description: https://leetcode-cn.com/problems/number-of-1-bits/
 * @FilePath: \leetcode-googtech\#191. Number of 1 Bits\Solution.java
 * @WebSite: https://algorithm.show/
 */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 使用与(&)运算,即两位同时为1时结果才为1
        return n == 0 ? 0 : 1 + hammingWeight(n & (n - 1)); 
    }
}
