/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 17:41:16
 * @LastEditTime: 2020-08-21 17:41:59
 * @Description: https://leetcode-cn.com/problems/maximum-69-number/
 * @FilePath: \leetcode-googtech\#1323. Maximum 69 Number\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int maximum69Number (int num) {
        return Integer.valueOf(String.valueOf(num).replaceFirst("6", "9"));
    }
}
