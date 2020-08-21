/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 09:06:29
 * @LastEditTime: 2020-08-21 09:06:50
 * @Description: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#03. 数组中重复的数字\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 先排序后查找
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
