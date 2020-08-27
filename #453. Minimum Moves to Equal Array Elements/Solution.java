/*
 * @Author: Goog Tech
 * @Date: 2020-08-27 18:08:49
 * @LastEditTime: 2020-08-27 18:09:12
 * @Description: https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * @FilePath: \leetcode-googtech\#453. Minimum Moves to Equal Array Elements\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 解题思路: 每次 n - 1 个数同时加一等同于每次有一个数自身减一,
    // 进而每个元素减去最小值的和就是答案,最后数组中的元素都为最小值
    public int minMoves(int[] nums) {
        int sum = 0;
        int minNum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(minNum > nums[i]) {
                minNum = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i] - minNum;
        }
        return sum;
    }
}
