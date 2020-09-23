/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 21:16:35
 * @LastEditTime: 2020-09-23 21:17:52
 * @Description: https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * @FilePath: \leetcode-googtech\#746. Min Cost Climbing Stairs\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // DP : 动态规划
    public int minCostClimbingStairs(int[] cost) {
        // 初始化 dp 数组及头两个元素
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        // 循环遍历 cost 数组,用每一步选择台所消耗的最小体力值来初始化 dp
        for(int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        // 注意: 楼层顶部在数组之外,所以最后需要取 dp 数组中最后两个元素的最小值
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}
