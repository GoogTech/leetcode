/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 14:24:10
 * @LastEditTime: 2020-08-16 14:25:49
 * @Description: https://leetcode-cn.com/problems/add-digits/
 * @FilePath: \leetcode-googtech\#258. Add Digits\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
