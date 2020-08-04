/*
 * @Author: Good Tech
 * @Date: 2020-08-04 16:02:27
 * @LastEditTime: 2020-08-04 16:03:46
 * @Description: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#05. 替换空格\Solution.java
 */

class Solution {
    public String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        // 遍历字符串s中的每个字符
        for(Character c : s.toCharArray()) {
            // 当 c 为空格时,向result后添加字符串"%20"
            if(c == ' ') {
                result.append("%20");
            // 当 c 不为空格时,向result后添加字符c
            }else {
                result.append(c);
            }
        }
        // 将result转换为字符串并返回
        return result.toString();
    }
}
