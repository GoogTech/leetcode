/*
 * @Author: Goog Tech
 * @Date: 2020-08-03 17:04:28
 * @LastEditTime: 2020-08-03 17:43:08
 * @Description: https://leetcode-cn.com/problems/valid-palindrome-ii/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.java
 */

/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */

// @lc code=start
class Solution {
    // 双指针法
    public boolean validPalindrome(String s) {
        // 遍历字符串,判断头尾指针所指的字符是否相等
        for(int i = 0, j = s.length()-1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                // 两种情况: 删除尾指针或头指针所指的字符,然后再判断其是否为回文字符串
                return isPalindrome(s, i, j-1) || isPalindrome(s, i+1, j);
            }
        }
        return true;
    }
    // 判断字符串是否为回文
    public boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
