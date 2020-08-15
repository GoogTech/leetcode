/*
 * @Author: Goog Tech
 * @Date: 2020-08-15 09:15:36
 * @LastEditTime: 2020-08-15 09:50:58
 * @Description: https://leetcode-cn.com/problems/valid-palindrome/
 * @FilePath: \leetcode-googtech\#125. Valid Palindrome\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // 判断字符串是否为空
        if(s == null || s.length() == 0) return true;
        // 将字符串中的字符转换为小写
        s = s.toLowerCase();
        // 初始化头尾指针
        int left = 0, right = s.length() - 1;
        // 利用双指针循环遍历字符串中的字符
        while(left < right) {
            // 遇到非数字或字母则跳过
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            // 如果头尾指针所指的字符不相等,则判定为非回文串
            if(s.charAt(left) != s.charAt(right)) return false;
            // 继续移动双指针
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end
