/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 14:15:21
 * @LastEditTime: 2020-08-14 14:40:21
 * @Description: https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * @FilePath: \leetcode-googtech\#1047. Remove All Adjacent Duplicates In String\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String S) {
        // 将字符串转为字符数组
        char[] c = S.toCharArray();
        // 初始化辅助栈
        Stack<Character> stack = new Stack<>();
        // 遍历字符串,判断当前元素是否与栈顶元素相同
        for(int i = 0; i < c.length; i++) {
            // 若相同则弹出栈顶元素,反之将其继续存储到辅助栈中
            if(!stack.isEmpty() && c[i] == stack.peek()) {
                stack.pop();
            }else {
                stack.push(c[i]);
            }
        }
        // 将结果转换为字符串并返回
        StringBuilder  str = new StringBuilder();
        for(Character ch : stack) {
            str.append(ch);
        }
        return str.toString();
    }
}
// @lc code=end
