/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 11:39:16
 * @LastEditTime: 2020-08-16 11:39:27
 * @Description: https://leetcode-cn.com/problems/sort-array-by-parity/
 * @FilePath: \leetcode-googtech\#905. Sort Array By Parity\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    // 双指针法
    public int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while(left < right) {
            while(left < right && A[left] % 2 == 0) left++;
            while(left < right && A[right] % 2 != 0) right--;
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
        }
        return A;
    }
}
