/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 12:12:07
 * @LastEditTime: 2020-08-15 12:16:24
 * @Description: https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * @FilePath: \leetcode-googtech\#1480. Running Sum of 1d Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1480 lang=java
 *
 * [1480] 一维数组的动态和
 */

// @lc code=start
class Solution {

    // 双指针法
    public int[] runningSum(int[] nums) {
        for(int i = 0, j = 0; j < nums.length; j++) {
            i = nums[j] + i;
            nums[j] = i;
        }
        return nums;
    }
}
// @lc code=end
