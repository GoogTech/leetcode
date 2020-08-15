/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 17:53:39
 * @LastEditTime: 2020-08-15 17:56:52
 * @Description: https://leetcode-cn.com/problems/single-number/
 * @FilePath: \leetcode-googtech\#136. Single Number\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {

    // 数组中的全部元素的异或运算结果即为数组中只出现一次的数字
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int num : nums) single ^= num;
        return single;
    }
}
// @lc code=end
