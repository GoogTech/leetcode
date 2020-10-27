/*
 * @Author: Goog Tech
 * @Date: 2020-10-27 11:45:11
 * @LastEditTime: 2020-10-27 11:46:35
 * @Description: https://leetcode-cn.com/problems/hamming-distance/
 * @FilePath: \leetcode-googtech\#461. Hamming Distance\Solution.java
 * @WebSite: https://algorithm.show/
 */
class Solution {
    
    // 使用内置函数
    // public int hammingDistance(int x, int y) {
    //    return Integer.bitCount(x ^ y); 
    // }

    // 异或运算 + 与运算判断 + 位移
    // 两个数的汉明距离就是这两个数进行异或运算,然后统计结果 x 的二进制中 1 的个数
    public int hammingDistance(int x, int y) {
       int result = x ^ y;
       int count = 0;
       while(result != 0) {
           if((result & 1) == 1) count++;
           result  = result >> 1;
       }
       return count;
    }
}
