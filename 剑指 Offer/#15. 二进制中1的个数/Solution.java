/*
 * @Author: Goog Tech
 * @Date: 2020-08-18 15:31:22
 * @LastEditTime: 2020-08-18 15:31:41
 * @Description: https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#15. 二进制中1的个数\Solution.java
 * @WebSite: https://algorithm.show/
 */

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // 使用与(&)运算,即两位同时为1时结果才为1
        return n == 0 ? 0 : 1 + hammingWeight(n & (n - 1));
    }
}
