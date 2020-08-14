/*
 * @Author: Goog Tech
 * @Date: 2020-08-14 17:42:47
 * @LastEditTime: 2020-08-14 17:59:37
 * @Description: https://leetcode-cn.com/problems/move-zeroes/
 * @FilePath: \leetcode-googtech\#283. Move Zeroes\Soultion.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null) return;
        //第一次遍历: 将数组中的非零元素赋值给nums[j]
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //第二次遍历: 非零元素已移动完毕,最后将数组末尾元素赋值为0即可
        for(int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
// @lc code=end
