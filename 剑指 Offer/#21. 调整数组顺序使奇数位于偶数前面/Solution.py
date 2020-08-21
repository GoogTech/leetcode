'''
Author: Goog Tech
Date: 2020-08-21 09:48:51
LastEditTime: 2020-08-21 09:49:54
Description: https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
FilePath: \leetcode-googtech\剑指 Offer\#21. 调整数组顺序使奇数位于偶数前面\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def exchange(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        i = 0
        # 循环遍历数组元素
        for j in range(len(nums)):
            # 若当前元素为奇数,则交换奇偶元素的位置
            if nums[j] % 2 != 0:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
        # 返回结果
        return nums
