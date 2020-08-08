/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 07:28:06
 * @LastEditTime: 2020-08-09 07:33:49
 * @Description: https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @FilePath: \leetcode-googtech\#557. Reverse Words in a String III\Solution.java
 */

class Solution {
    public String reverseWords(String s) {
        // 去除字符串中的空格并将其转化为字符数组
        String[] str = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        // 遍历数组中的字符串元素
        for(int i = 0; i < str.length; i++) {
            // 将其反转后添加到stringbuffer中
            buffer.append(new StringBuffer(str[i]).reverse().toString());
            // 并且每遍历一个字符串元素后就在stringbuffer后添加一个空格
            buffer.append(" ");
        }
        // 删除字符串中的头尾空格后返回
        return buffer.toString().trim();
    }
}
