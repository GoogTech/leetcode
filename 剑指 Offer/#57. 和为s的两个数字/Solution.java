/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 15:28:20
 * @LastEditTime: 2020-08-04 15:36:01
 * @Description: https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#57. 和为s的两个数字\Solution.java
 */

class Solution {
    /**
     * 双指针法
     * 
     * 1. 初始化双指针,使其分别指向数组的左右两端
     * 2. 遍历数组元素,当双指针相遇时终止循环
     *    a. 计算 total = nums[left] + nums[right]
     *    b. 若 total > target,则指针right向左移动
     *    c. 若 total < target,则指针left向右移动
     *    d. 若 total = target,则立即返回结果数组[nums[left], nums[right]]  
     */
    public int[] twoSum(int[] nums, int target) {
        // 初始化双指针,使其分别指向数组的左右两端
        int left = 0, right = nums.length -1;
        // 遍历数组元素,当双指针相遇时终止循环
        while(left < right) {
            int sum = nums[left] + nums[right];
            // left指针右移
            if(sum < target) {
                left++;
            // right指针左移
            }else if(sum > target) {
                right--;
            // 返回结果数组
            }else {
                return new int[] { nums[left], nums[right] };
            }
        }
        // 无结果
        return new int[] {-1, -1};
    }
}
