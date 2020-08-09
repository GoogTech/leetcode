/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 10:29:21
 * @LastEditTime: 2020-08-09 10:29:54
 * @Description: https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @FilePath: \leetcode-googtech\#977. Squares of a Sorted Array\Solution.java
 */

class Solution {
    
    // 双指针法
    public int[] sortedSquares(int[] A) {
        // 初始化双指针
        int start = 0, end = A.length;
        int index = end - 1;
        // 初始化结果数组
        int [] nums = new int[end--];
        // 循环遍历数组中元素,并计算其平方值,然后按照递增的顺序存储到结果数组中
        while(index >= 0) nums[index--] = A[start]*A[start] >= A[end]*A[end] ? A[start]*A[start++] : A[end]*A[end--];
        // 返回结果数组
        return nums;
    }
}
