/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 12:02:50
 * @LastEditTime: 2020-08-24 12:17:53
 * @Description: https://leetcode-cn.com/problems/container-with-most-water/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\11.盛最多水的容器.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {

    // 双指针法
    public int maxArea(int[] height) {
        // 初始化左右指针及结果面积的值
        int left = 0, right = height.length - 1, result = 0;
        // 通过移动左右指针来循环遍历数组元素
        while(left < right) {
            // 求出当前容器的面积
            // 注意: 是min()而非max(),因为求的是长方形的面积,需考虑左右高度对称性哟
            int area = Math.min(height[left], height[right]) * (right - left);
            // 与上个结果面积相比较,求出最值面积
            result = Math.max(result, area);
            // 若左指针的长度小于右指针所指元素的长度,则向右移动左指针,反之向左移动右指针
            if(height[left] <= height[right]) {
                left++;
            }else {
                right--;
            }
        }
        // 返回最值面积
        return result;
    }
}
// @lc code=end
