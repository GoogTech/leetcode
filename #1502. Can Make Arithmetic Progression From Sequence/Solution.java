/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 08:52:53
 * @LastEditTime: 2020-08-15 08:55:56
 * @Description: https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 * @FilePath: \leetcode-googtech\#1502. Can Make Arithmetic Progression From Sequence\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1502 lang=java
 *
 * [1502] 判断能否形成等差数列
 */

// @lc code=start
class Solution {

    // 对原序列排序后,若其元素满足 An x 2 = An-1 + An+1 则判定其为等差数列
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] * 2 != arr[i - 1] + arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
