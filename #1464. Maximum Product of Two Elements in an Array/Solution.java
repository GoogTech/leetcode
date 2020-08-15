/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 14:44:31
 * @LastEditTime: 2020-08-15 14:45:04
 * @Description: https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 * @FilePath: \leetcode-googtech\#1464. Maximum Product of Two Elements in an Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
