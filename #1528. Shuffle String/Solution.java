/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 13:47:08
 * @LastEditTime: 2020-08-14 13:54:14
 * @Description: https://leetcode-cn.com/problems/shuffle-string/
 * @FilePath: \leetcode-googtech\#1528. Shuffle String\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=5472 lang=java
 *
 * [5472] 重新排列字符串
 */

// @lc code=start
class Solution {
    public String restoreString(String s, int[] indices) {
        // 创建一个与字符串相同长度的数组
        int length = s.length();
        char[] result = new char[length];
        // 循环填充数组,其中indices[i]作为索引,s.charAt(i)作为索引值
        for(int i = 0; i < length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        // 将数组装换为字符串并返回
        return new String(result);
    }
}
// @lc code=end
