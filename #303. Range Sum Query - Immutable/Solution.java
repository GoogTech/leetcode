/*
 * @Author: Goog Tech
 * @Date: 2020-09-15 15:07:30
 * @LastEditTime: 2020-09-15 15:11:43
 * @Description: https://leetcode-cn.com/problems/range-sum-query-immutable/
 * @FilePath: \leetcode-googtech\#303. Range Sum Query - Immutable\Solution.java
 * @Reference: https://leetcode-cn.com/problems/range-sum-query-immutable/solution/marveljian-dan-de-xue-xi-bi-ji-303-by-tyanyonecanc/
 * @WebSite: https://algorithm.show/
 */

class NumArray {

    private int[] sum;

    // DP : 动态规划
    public NumArray(int[] nums) {
        sum = Arrays.copyOf(nums, nums.length);
        for(int i = 1; i < sum.length; i++) {
            // sum[i] 的值为 sum[0] 到 sum[i] 的所有值之和
            sum[i] += sum[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        return (i == 0) ? sum[j] : (sum[j] - sum[i - 1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
