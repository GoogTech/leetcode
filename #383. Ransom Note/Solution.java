/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 16:26:33
 * @LastEditTime: 2020-08-24 16:26:50
 * @Description: https://leetcode-cn.com/problems/ransom-note/
 * @FilePath: \leetcode-googtech\#383. Ransom Note\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // 用数组代替哈希表
    public boolean canConstruct(String ransomNote, String magazine) {
        // 初始化整型数组
        int[] countR = new int[26];
        int[] countM = new int[26];
        // 存储每个字符对应的数值,其中 c - a 为数组索引,其取值范围为 0 到 25,而值为该字母出现的次数
        for(char c : ransomNote.toCharArray()) countR[c - 'a'] ++;
        for(char c : magazine.toCharArray()) countM[c - 'a'] ++;
        // 遍历数组,逐个判断countR中元素出现的次数是否大于countM
        for(int i = 0; i < 26; i++) {
            if(countR[i] > countM[i]) {
                return false;
            }
        }
        return true;
    }
}
