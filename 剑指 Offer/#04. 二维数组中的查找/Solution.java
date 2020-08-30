/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 18:00:35
 * @LastEditTime: 2020-08-30 18:00:46
 * @Description: https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#04. 二维数组中的查找\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 从右上角开始走，利用这个顺序关系可以在 O(m + n) 的复杂度下解决这个题:
    // 1. 如果当前位置元素比 target 小,则 row++
    // 2. 如果当前位置元素比 target大,则 col--
    // 3. 如果相等则返回 true
    // 4. 如果越界了还没找到则说明不存在,返回 false
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] > target) {
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
