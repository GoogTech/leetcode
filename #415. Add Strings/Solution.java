/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 19:18:41
 * @LastEditTime: 2020-08-24 19:20:49
 * @Description: https://leetcode-cn.com/problems/add-strings/
 * @FilePath: \leetcode-googtech\#415. Add Strings\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        // 初始化进位值及两个字符串的尾指针
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        // 循环遍历字符串
        while(i >= 0 || j >= 0 || carry != 0) {
            // 移动字符串尾指针,并累加元素值,其中减 '0' 是为了将字符型转换为整型
            if(i >= 0) carry += num1.charAt(i--) - '0';
            if(j >= 0) carry += num2.charAt(j--) - '0';
            // 取个位数值并将其存储到 sb 中
            sb.append(carry % 10);
            // 舍去个位数值进而获取进位值
            carry = carry / 10;
        }
        // 将结果反转后返回
        return sb.reverse().toString();
    }
}
