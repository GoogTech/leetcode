/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 21:57:50
 * @LastEditTime: 2020-08-15 21:58:08
 * @Description: https://leetcode-cn.com/problems/shuffle-the-array/
 * @FilePath: \leetcode-googtech\#1470. Shuffle the Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length == 2) return nums;
        int[] result = new int[n << 1];
        for(int i = 0; i < n; i++) {
            result[2 * i] = nums[i]; // 偶数
            result[2 * i + 1] = nums[i + n]; // 奇数
        }
        return result;
    }
}
