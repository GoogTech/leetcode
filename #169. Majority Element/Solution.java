/*
 * @Author: Goog Tech
 * @Date: 2020-10-27 14:30:14
 * @LastEditTime: 2020-10-27 14:30:53
 * @Description: https://leetcode-cn.com/problems/majority-element/
 * @FilePath: \leetcode-googtech\#169. Majority Element\Solution.java
 * @WebSite: https://algorithm.show/
 */
class Solution {
    // 摩尔投票法
    public int majorityElement(int[] nums) {
        int count = 0, result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                result = nums[i];
                count++;
            }else {
                if(result == nums[i]) count++;
                else count--;
            }
        }
        return result;
    }
}
