/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 08:55:36
 * @LastEditTime: 2020-08-24 09:08:00
 * @Description: https://leetcode-cn.com/problems/merge-sorted-array/
 * @FilePath: \leetcode-googtech\#88. Merge Sorted Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {

    // 先合并后排序: 但这种方法没有利用两个数组本身已经有序这一点
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // arraycopy(Object src,int srcPos,Object dest, int destPos,int length)；
        System.arraycopy(nums2, 0, nums1, m , n);
        Arrays.sort(nums1);
    }
}
// @lc code=end
