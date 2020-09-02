/*
 * @Author: Goog Tech
 * @Date: 2020-09-02 22:04:54
 * @LastEditTime: 2020-09-02 22:05:22
 * @Description: https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
 * @FilePath: \leetcode-googtech\#921. Minimum Add to Make Parentheses Valid\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int minAddToMakeValid(String S) {
        int left = 0, result = 0;
        for(char c : S.toCharArray()) {
            if(c == '(') {
                left++; // 左括号多余
            }else {
                if(left == 0) {
                    result++; // 右括号多余
                }else {
                    left--;
                }
            }
        }
        return result + left;
    }
}
