/*
 * @Author: Goog Tech
 * @Date: 2020-09-16 13:39:46
 * @LastEditTime: 2020-09-16 13:40:07
 * @Description: https://leetcode-cn.com/problems/climbing-stairs/
 * @FilePath: \leetcode-googtech\#70. Climbing Stairs\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // DP : 动态规划
    // 解题思路 : 爬 i 层楼梯的方式数 = 爬 i-2 层楼梯的方式数 + 爬 i-1 层楼梯的方式数,
    // 所以我们得到公式 dp[n] = dp[n-1] + dp[n-2]
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }
}
