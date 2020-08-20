/*
 * @Author: Goog Tech
 * @Date: 2020-08-20 13:03:51
 * @LastEditTime: 2020-08-20 13:04:12
 * @Description: https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#58 - I. 翻转单词顺序\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    /**
    * 双指针法
    * 
    * 1.倒序遍历字符串s,记录单词左右索引边界left,right.
    * 2.每确定一个单词的边界,则将其添加到单词列表result中.
    * 3.最后将单词列表拼接为字符串并去除头尾空格,将其返回即可.
    */
   public String reverseWords(String s) {
       // 删除字符串的首尾空格
       s = s.trim();
       // 初始化双指针,使得left与right指向字符串尾字符
       int right = s.length() - 1,left = right;
       StringBuilder result = new StringBuilder();
       // 通过移动左指针来检查字符串中是否含有单词
       while(left >= 0) {
           // left指针向左移动: 寻找第一个空格
           while(left >= 0 && s.charAt(left) != ' ') left--;
           // 将单词添加到result中,并在其后添加空格
           result.append(s.substring(left + 1, right + 1) + " ");
           // 跳过单词之间的空格
           while(left >= 0 && s.charAt(left) == ' ') left --;
           // 使得right指向下一个单词的尾字符
           right = left;
       }
       // 将结果转换为字符串并删除头尾空格
       return result.toString().trim();
   };
}
