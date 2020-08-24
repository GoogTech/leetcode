'''
Author: Goog Tech
Date: 2020-08-24 11:45:49
LastEditTime: 2020-08-24 12:06:36
Description: 
FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\11.盛最多水的容器.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=11 lang=python
#
# [11] 盛最多水的容器
#

# @lc code=start
class Solution(object):

    # 双指针法
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # 初始化双指针及最值面积的值
        left, right, result = 0, len(height) - 1, 0
        # 通过移动左右指针来循环遍历数组元素
        while left < right:
            # 求出当前容器的面积
            area = min(height[left], height[right]) * (right - left)
            # 与上个结果面积相比较,求出最值面积
            result = max(result, area)
            # 若左指针的长度小于右指针所指元素的长度,则向右移动左指针,反之向左移动右指针
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
        # 返回最值面积
        return result        
# @lc code=end
