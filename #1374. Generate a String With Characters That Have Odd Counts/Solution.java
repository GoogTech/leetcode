/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 16:02:28
 * @LastEditTime: 2020-08-29 16:02:51
 * @Description: https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 * @FilePath: \leetcode-googtech\#1374. Generate a String With Characters That Have Odd Counts\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n % 2 == 0) {
            sb.append('a');
            n--;
        }
        for(int i = 0; i < n; i++) {
            sb.append('b');
        }
        return sb.toString();
    }
}
