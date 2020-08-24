/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 14:34:03
 * @LastEditTime: 2020-08-24 14:34:15
 * @Description: https://leetcode-cn.com/problems/length-of-last-word/
 * @FilePath: \leetcode-googtech\#58. Length of Last Word\Solution.java
 * @WebSite: https://algorithm.show/
 */
class Solution {
    public int lengthOfLastWord(String s) {
        // 初始化字符串尾部指针及结果值
        int result = 0, tail = s.length() - 1;
        // 首先删除字符串尾部空格
        while(tail >= 0 && s.charAt(tail) == ' ') {
            tail -= 1;
        }
        // 计数最后一个单词的长度
        while(tail >= 0 && s.charAt(tail) != ' ') {
            result += 1;
            tail -= 1;
        }
        // 返回结果
        return result;
    }
}
