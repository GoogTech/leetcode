/*
 * @Author: Goog Tech
 * @Date: 2020-09-16 14:18:58
 * @LastEditTime: 2020-09-16 14:19:12
 * @Description: https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * @FilePath: \leetcode-googtech\#121. Best Time to Buy and Sell Stock\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // DP : 动态规划思想
    // 解题思路 : 前 i 天的最大收益 = MAX(前 i-1 天的最大收益, 第 i 天的价格 - 前 i-1 天中的最小价格)
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        int minPrice = prices[0], maxPrice = 0;
        for(int i = 1; i < prices.length; i++) {
            maxPrice = Math.max(maxPrice, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxPrice;
    }
}
