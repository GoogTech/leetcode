/*
 * @Author: Goog Tech
 * @Date: 2020-07-16 20:45:04
 * @Description: https://leetcode-cn.com/problems/valid-parentheses/
 * @FilePath: \leetcode-googtech\#20. Valid Parentheses\Solution.java
 */ 
class Solution {
    public boolean isValid(String s) {
        // 初始化栈
        Stack<Character> stack = new Stack<Character>();
        // 遍历字符串,逐个比较字符
        for(char c:s.toCharArray()){
            // 将左括号压入栈中
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            // 弹出左括号并与右括号相比较
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        // 如果左右括号全部匹配完毕则栈为空
        return stack.isEmpty();
    }
}
