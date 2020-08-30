/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 17:19:51
 * @LastEditTime: 2020-08-30 17:20:08
 * @Description: https://leetcode-cn.com/problems/backspace-string-compare/
 * @FilePath: \leetcode-googtech\#844. Backspace String Compare\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 本题主要考察双指针,这里利用栈结构来解答下吧嘿嘿😅
    public boolean backspaceCompare(String S, String T) {
        // 初始化栈结构,其用于存储 S 与 T 字符串中的字符
        Stack<Character> sstack = new Stack<>();
        Stack<Character> tstack = new Stack<>();
        // 遍历字符串 S 中的字符
        for(int i = 0; i < S.length(); i++) {
            // 判断当前字符是否等于符号 #
            if(S.charAt(i) != '#') {
                // 若不等于则将其压入栈中
                sstack.push(S.charAt(i));
            // 判断当前栈是否为空
            }else if(!sstack.isEmpty()) {
                // 若不为空则弹出栈顶元素,即删除符号 # 前的一个字符
                sstack.pop();
            }
        }
        // 同上
        for(int j = 0; j < T.length(); j++) {
            if(T.charAt(j) != '#') {
                tstack.push(T.charAt(j));
            }else if(!tstack.isEmpty()) {
                tstack.pop();
            }
        }
        // 最后判断两个栈中的元素是否相同,并返回其结果
        return sstack.equals(tstack);
    }
}
