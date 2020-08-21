/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 15:15:57
 * @LastEditTime: 2020-08-21 15:16:19
 * @Description: https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * @FilePath: \leetcode-googtech\#1295. Find Numbers with Even Number of Digits\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 先将整型数组中的元素逐个转换为字符串,然后计算每个字符串的长度即可
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) count += String.valueOf(num).length() % 2 == 0 ? 1 : 0;
        return count;
    }
}
