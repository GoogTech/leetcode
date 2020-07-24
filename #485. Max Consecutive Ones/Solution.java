/*
 * @Author: Goog Tech
 * @Date: 2020-07-24 16:51:42
 * @Description: https://leetcode-cn.com/problems/max-consecutive-ones/
 * @FilePath: \leetcode-googtech\#485. Max Consecutive Ones\Solution.java
 */ 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // 初始化变量
        int result = 0,count = 0;
        // 遍历数组中的元素
        for(int i = 0;i < nums.length;i++) {
            // 统计数组中的连续相同元素的个数
            count = nums[i] == 1 ? count+1 : 0;
            // 若count为0则表示数组中无连续相同的元素
            result = count > result ? count : result;
        }
        // 返回结果
        return result;
    }
}
