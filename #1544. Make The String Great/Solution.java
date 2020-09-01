/*
 * @Author: Goog Tech
 * @Date: 2020-09-01 23:41:35
 * @LastEditTime: 2020-09-01 23:41:53
 * @Description: https://leetcode-cn.com/problems/make-the-string-great/
 * @FilePath: \leetcode-googtech\#1544. Make The String Great\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public String makeGood(String s) {
        // 若当前字符串仅有一个字符则直接返回其本身即可
        if(s.length() == 1) return s;
        // 初始化辅助栈
        Stack<Character> stack = new Stack<>();
        // 将字符串中第一个字符压入栈中
        stack.push(s.charAt(0));
        // 逐个遍历字符串中的字符
        for(int i = 1; i < s.length(); i++) {
            // 若栈不为空则将当前字母压入栈中
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            // 反之则判断当前字符与栈顶元素是否为相同字母( 相同字母大小写的 ASCII 码相差 32 )
            }else {
                // 若为相同字母则弹出栈顶元素
                if(s.charAt(i) - stack.peek() == 32 || s.charAt(i) - stack.peek() == -32) {
                    stack.pop();
                // 反之则将当前字母压入栈中
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        // 遍历完毕后若辅助栈中并无元素,则返回空字符串即可
        if(stack.size() == 0) {
            return "";
        // 若栈中仅有一个元素则弹出栈顶元素并将其转换为字符型,然后返回
        }else if(stack.size() == 1) {
            return String.valueOf(stack.pop());
        // 反之则说明栈中有多个元素
        }else {
            // 进而通过循环遍历将栈中元素插入到 StringBuilder 中
            StringBuilder result = new StringBuilder();
            while(!stack.isEmpty()) {
                result.insert(0, stack.pop());
            }
            // 最后将其转换为字符串并返回
            return result.toString();
        }
    }
}
