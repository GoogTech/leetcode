/*
 * @Author: Goog Tech
 * @Date: 2020-07-13 21:36:25
 * @Description: #1. Two Sum
 * @FilePath: \leetcode-googtech\#1. Two Sum\Solution.java
 */ 
import java.util.Arrays;

class Solution {
    // 暴力法
    public int[] twoSum(final int[] nums, final int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    // 测试
    public static void main(final String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[] { 2, 7, 11, 15 }, 9))); // [0, 1]
    }
}
