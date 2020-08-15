/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 21:24:49
 * @LastEditTime: 2020-08-15 21:32:09
 * @Description: https://leetcode-cn.com/problems/xor-operation-in-an-array/
 * @FilePath: \leetcode-googtech\#1486. XOR Operation in an Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1486 lang=java
 *
 * [1486] 数组异或操作
 */

// @lc code=start
class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        for(int i = 0; i < n; i++) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}
// @lc code=end
