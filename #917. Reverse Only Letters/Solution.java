/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 18:35:39
 * @LastEditTime: 2020-08-21 18:36:02
 * @Description: https://leetcode-cn.com/problems/reverse-only-letters/
 * @FilePath: \leetcode-googtech\#917. Reverse Only Letters\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 双指针法
    public String reverseOnlyLetters(String S) {
        // 初始化头尾指针
        int left = 0, right = S.length() - 1;
        // 将字符串转换为字符数组
        char[] chars = S.toCharArray();
        while(left < right) {
            // 若头元素不是字母则将头指针持续向后移动,同理后指针持续向前移动
            while(!(Character.isLetter(chars[left])) && left < right) left++;
            while(!(Character.isLetter(chars[right])) && left < right) right--;
            // 直到头尾指针所指元素都是字母,然后交换其元素位置
            char c = chars[left];
            chars[left] = chars[right];
            chars[right] = c;
            // 继续移动头尾指针
            left++;
            right--;
        }
        // 将字符数组转换为字符串并返回
        return String.valueOf(chars);
    }
}
