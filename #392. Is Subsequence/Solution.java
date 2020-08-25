/*
 * @Author: Goog Tech
 * @Date: 2020-08-25 09:15:19
 * @LastEditTime: 2020-08-25 09:16:27
 * @Description: https://leetcode-cn.com/problems/is-subsequence/
 * @FilePath: \leetcode-googtech\#392. Is Subsequence\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public boolean isSubsequence(String s, String t) {
        // 分别获取两个字符的长度
        int n = s.length(), m = t.length();
        // 初始化双指针,分别指向 s 与 t 的初始位置
        int i = 0, j = 0;
        // 循环遍历两字符串
        while(i < n && j < m) {
            // 若字符匹配成功则 i 和 j 同时右移
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            // 反之 j 右移,尝试用 t 的下一个字符匹配 s
            }else {
                j++;
            }
        }
        // 若最终 i 移动到 s 的末尾,则说明 s 为 t 的子序列
        return i == n;
    }
}
