/*
 * @Author: Goog Tech
 * @Date: 2020-10-27 16:14:11
 * @LastEditTime: 2020-10-27 16:15:23
 * @Description: https://leetcode-cn.com/problems/generate-parentheses/
 * @FilePath: \leetcode-googtech\#22. Generate Parentheses\Solution.java
 * @WebSite: https://algorithm.show/
 * @Reference: https://leetcode-cn.com/problems/generate-parentheses/solution/hui-su-suan-fa-by-liweiwei1419/
 */
class Solution {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return result;
    }
    // DFS : 深度优先搜索算法
    private void dfs(int left, int right, String str) {
        // 在左边和右边剩余的括号数都等于 0 的时候结算
        if(left == 0 && right == 0) {
            result.add(str);
            return;
        }
        // 生成左枝叶的条件是: 左括号剩余数量大于 0
        if(left > 0) {
            dfs(left - 1, right, str + "(");
        }
        // 生成右枝叶的条件是: 左括号剩余数量小于右括号剩余数量
        if(right > left) {
            dfs(left, right - 1, str + ")");
        }
    }
}
