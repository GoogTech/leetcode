/*
 * @Author: Goog Tech
 * @Date: 2020-08-04 08:01:32
 * @LastEditTime: 2020-08-04 08:09:33
 * @Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\Solution.java
 * @Reference: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/solution/shuang-zhi-zhen-shan-chu-zhong-fu-xiang-dai-you-hu/
 */

/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    // 双指针法
    public int removeDuplicates(int[] nums) {
        // 判断数组长度及是否为空
        if(nums == null || nums.length == 0) return 0;
        // 初始化前后指针
        int left = 0, right = 1;
        // 通过移动前后指针来遍历数组中的元素
        while(right < nums.length) {
            // 若前后指针所指元素不相同(此时前后指针中间隔一个元素),则将right位置上的元素复制到left位置上
            // 然后left与right同时向后移动一位
            if(nums[left] != nums[right]) {
                nums[left + 1] = nums[right];
                left ++;
            }
            // 若前后指针所指的元素相同则right向后移动一位
            right++;
        }
        // 返回数组的长度
        return left + 1;
    }
}
// @lc code=end
