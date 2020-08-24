/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 17:00:00
 * @LastEditTime: 2020-08-24 17:00:38
 * @Description: https://leetcode-cn.com/problems/valid-anagram/
 * @FilePath: \leetcode-googtech\#242. Valid Anagram\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // 使用数组替代哈希表
    public boolean isAnagram(String s, String t) {
        // 判断两字符串的长度是否相同
        if(s.length() != t.length()) return false;
        // 初始化整型数组
        int[] arr = new int[26];
        // 遍历字符串,其中 s.charAt(i) - a 作为元素索引,
        // 其取值范围为 0 到 25,并将该字母出现的次数作为索引值
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] ++;
            arr[t.charAt(i) - 'a'] --;
        }
        // 遍历数组,若元素为不为零则证明二者并非字母异位词
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
