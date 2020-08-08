/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 07:04:17
 * @LastEditTime: 2020-08-09 07:05:23
 * @Description: https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * @FilePath: \leetcode-googtech\#434. Number of Segments in a String\Solution.java
 */

class Solution {
    public int countSegments(String s) {
        // 将字符串转换为char数组
        char[] chars = s.toCharArray();
        int len = 0;
        char lastChar = ' ';
        // 遍历char数组并统计字符串中的空格数
        for(char c : chars) {
            if(c != ' ' && lastChar == ' ') {
                len++;
            }
            lastChar = c;
        }
        return len;
    }
}
