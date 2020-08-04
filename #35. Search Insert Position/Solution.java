/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 12:32:36
 * @LastEditTime: 2020-08-04 12:33:09
 * @Description: https://leetcode-cn.com/problems/search-insert-position/
 * @FilePath: \leetcode-googtech\#35. Search Insert Position\Solution.java
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
