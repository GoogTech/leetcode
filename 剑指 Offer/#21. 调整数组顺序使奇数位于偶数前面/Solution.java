/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 09:48:44
 * @LastEditTime: 2020-08-21 09:49:16
 * @Description: https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#21. 调整数组顺序使奇数位于偶数前面\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public int[] exchange(int[] nums) {
        // 初始化头尾指针
        int left = 0, right = nums.length - 1;
        // 通过移动头尾指针来循环遍历数组元素
        while(left < right) {
            // 若当前元素为奇数则持续从左往右移动头指针,直到定位到偶数元素
            while(left < right && nums[left] % 2 != 0) left++;
            // 若当前元素为偶数则持续从右往左移动尾指针,直到定位到奇数元素
            while(left < right && nums[right] % 2 == 0) right--;
            // 交换奇偶元素的位置
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        // 返回结果
        return nums;
    }
}
