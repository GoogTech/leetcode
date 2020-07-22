/*
 * @Author: Goog Tech
 * @Date: 2020-07-22 18:03:18
 * @Description: https://leetcode-cn.com/problems/reverse-string/
 * @FilePath: \leetcode-googtech\#344. Reverse String\Solution.java
 */ 
class Solution {
    // 双指针法
    public void reverseString(final char[] s) {
        char temp;
        int left = 0,right = s.length - 1;
        while(left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
