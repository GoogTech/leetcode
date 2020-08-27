/*
 * @Author: Goog Tech
 * @Date: 2020-08-28 06:58:43
 * @LastEditTime: 2020-08-28 06:59:05
 * @Description: https://leetcode-cn.com/problems/construct-the-rectangle/
 * @FilePath: \leetcode-googtech\#492. Construct the Rectangle\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public int[] constructRectangle(int area) {
        // 取面积 area 的平方根
        int sqrt = (int)Math.sqrt(area);
        // 初始化双指针,即宽度与长度
        int width = sqrt, length = sqrt;
        // 通过移动双指针实现循环遍历
        while(width <= length) {
            // 若当前宽度和长度的乘积等于给定面积,则返回结果值
            if(width * length == area) {
                return new int[]{length, width};
            // 若小于则移动 length 指针,即增大长度值
            }else if(width * length < area) {
                length++;
            // 反之则减小宽度值(要求 L >= W)
            }else {
                width--;
            }
        }
        // 无果
        return new int[]{0, 0};
    }
}
