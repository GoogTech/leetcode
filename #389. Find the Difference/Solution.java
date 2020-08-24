/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 15:42:39
 * @LastEditTime: 2020-08-24 15:43:17
 * @Description: https://leetcode-cn.com/problems/find-the-difference/
 * @FilePath: \leetcode-googtech\#389. Find the Difference\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // 解题思路: 首先将字符串转换为字符数组,然后求和做差,即可得到新插入的字符
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(char c : t.toCharArray()) sum += c;
        for(char c : s.toCharArray()) sum -= c;
        return (char)sum;
    }
}
