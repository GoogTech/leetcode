/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 21:10:15
 * @LastEditTime: 2020-08-15 21:15:56
 * @Description: https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * @FilePath: \leetcode-googtech\#1281. Subtract the Product and Sum of Digits of an Integer\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1, s = 0;
        // n % 10 即获取数值最后一位数字, n / 10 即删去数值的最后一位数字
        while(n != 0) {
            p *= n % 10;
            s += n % 10;
            n /= 10;
        }
        return p - s;
    }
}
// @lc code=end
