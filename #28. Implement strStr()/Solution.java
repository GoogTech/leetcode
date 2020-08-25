/*
 * @Author: Goog Tech
 * @Date: 2020-08-25 16:42:06
 * @LastEditTime: 2020-08-25 16:42:32
 * @Description: https://leetcode-cn.com/problems/implement-strstr/
 * @FilePath: \leetcode-googtech\#28. Implement strStr()\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 😅理应使用 KMP 算法,这里简单使用 API 啦
    public int strStr(String haystack, String needle) {
        // 分别获取两个字符串的长度
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        // 遍历字符串,其中 haystackLength - needleLength 是为了防止 substring 下标越界
        for(int i = 0; i <= haystackLength - needleLength; i++) {
            // 判断 needle 字符串是否与下标范围为 i 到 i + needleLength 所分割的字符串相等
            if(haystack.substring(i, i + needleLength).equals(needle)) {
                // 若相等则返回 needle 字符串出现的第一个位置的下标值
                return i;
            }
        }
        // 无果
        return -1;
    }
}
