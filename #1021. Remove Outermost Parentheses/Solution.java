/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 08:17:15
 * @LastEditTime: 2020-08-09 08:18:31
 * @Description: https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * @FilePath: \leetcode-googtech\#1021. Remove Outermost Parentheses\Solution.java
 */

class Solution {
    public String removeOuterParentheses(String S) {
        StringBuffer sb = new StringBuffer();
        // 将字符串转换为字符数组
        char[] chars = S.toCharArray();
        int level = 0;
        // 遍历字符数组,将最内层括号添加到sb中
        for(char c : chars) {
            if( c == ')') --level;
            if(level >= 1) sb.append(c);
            if(c == '(') ++level;
        }
        // 将结果转化为字符串并返回
        return sb.toString();
    }
}
