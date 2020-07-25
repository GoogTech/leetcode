/*
 * @Author: Goog Tech
 * @Date: 2020-07-25 17:39:22
 * @Description: https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 * @FilePath: \leetcode-googtech\#345. Reverse Vowels of a String\Solution.java
 */ 
class Solution {
    // 双指针法
    public String reverseVowels(String s) {
        // 声明用于交换数组元素的中间变量
        char temp;
        // 将字符串转换为数组
        char[] str = s.toCharArray();
        // 声明用于匹配的元音字符串
        String letter = "aeuioAEIUO";
        // 初始化头指针和尾指针
        int first = 0,last = s.length() - 1;
        // 遍历数组中的元素
        while(first < last){
            // 判断当前元素是否为元音
            // 若为元音则反转字符串中的元音字母,然后同时移动头和尾部指针.反之继续移动头或尾部指针
            if(letter.indexOf(str[first])!= -1  && letter.indexOf(str[last])!= -1){
                temp = str[first];
                str[first] = str[last];
                str[last] = temp;
                first++;
                last--;
            }else if(letter.indexOf(str[first])!= -1){
                last--;
            }else if(letter.indexOf(str[last])!= -1){
                first++;
            }else{
                first++;
                last--;
            }
        }
        // 返回结果
        return new String(str);
    }
}
