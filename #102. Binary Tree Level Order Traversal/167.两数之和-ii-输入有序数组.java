/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 06:14:03
 * @LastEditTime: 2020-08-04 06:44:43
 * @Description: https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.java
 */

/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    /**
     * 双指针法,解题思路如下 :
     * 
     * 1. 初始状态下,令left指向数组第一个元素,right指向最后一个元素
     * 2. 进入循环,控制循环退出的条件为: left >= right
     * 3. 在每一次循环中,如果left与right的数字之和等于所给的target,则返回当前的left,right
     * 4. 若left与right的数字之和小于所给的target,则left = left + 1,继续循环
     * 5. 若left与right的数字之和大于所给的target,则right = right -1,继续循环
     */
    public int[] twoSum(int[] numbers, int target) {
        // 初始化头尾指针
        int head = 0, tail = numbers.length - 1;
        // 通过移动头或尾部指针来遍历数组中的元素
        while(head < tail) {
            // 判断当前头尾指针所指的元素之和是否等于target
            int sum = numbers[head] + numbers[tail];
            if(sum  == target) {
                return new int[]{ head + 1, tail + 1 };
            }else if(sum < target) {
                ++head; // 头指针右移
            }else {
                --tail; // 尾指针左移
            }
        }
        // 无解
        return new int[]{-1, -1};
    }
}
// @lc code=end
