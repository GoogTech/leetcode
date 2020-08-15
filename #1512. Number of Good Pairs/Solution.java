/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 20:22:57
 * @LastEditTime: 2020-08-15 20:29:21
 * @Description: https://leetcode-cn.com/problems/number-of-good-pairs/
 * @FilePath: \leetcode-googtech\#1512. Number of Good Pairs\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1512 lang=java
 *
 * [1512] 好数对的数目
 */

// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
// @lc code=end
