/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 13:56:01
 * @LastEditTime: 2020-08-09 13:56:26
 * @Description: https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#17.打印从1到最大的n位数\Solution.java
 */

class Solution {
    public int[] printNumbers(int n) {
        // 计算待输出的长度,Math.pow()函数返回基数(base)的指数(exponent)次幂,例如10的2次方为100
        double length = Math.pow(10, n) - 1;
        // 初始化结果数组
        int[] result = new int[(int)length];
        // 将数值存储大到结果数组中
        for(int i = 0; i < length; i++) result[i] = i + 1;
        // 返回结果
        return result;
    }
}
