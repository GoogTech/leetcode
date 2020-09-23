/*
 * @Author: Goog Tech
 * @Date: 2020-09-23 21:28:55
 * @LastEditTime: 2020-09-23 21:31:31
 * @Description: https://leetcode-cn.com/problems/house-robber/
 * @FilePath: \leetcode-googtech\#198. House Robber\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // DP : 动态规划
    // 设第 n 个房屋的最大金额为 dp[n],解题思路如下:
    // 1. 若偷第 n 个房屋的话,由于相邻的房屋不能偷,所以 dp[n] = dp[n - 2] + nums[n] (即偷窃总金额等于 n - 2 间房屋的最大总金额 + 第 n 间房屋的金额)
    // 2. 反之若不偷第 n 个房屋的话,那么 dp[n] = dp[n - 1](即偷窃总金额为 n - 1 间房屋的最大金额)
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[n - 1];
    }
}
