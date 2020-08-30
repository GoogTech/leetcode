'''
Author: Goog Tech
Date: 2020-08-30 16:36:52
LastEditTime: 2020-08-30 16:37:12
Description: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
FilePath: \leetcode-googtech\#350. Intersection of Two Arrays II\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 双指针法
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # 分别对两个数组进行排序
        nums1, nums2 = sorted(nums1), sorted(nums2)
        # 初始化双指针
        l1, l2 = 0, 0
        # 初始化结果列表
        result = []
        # 通过分别移动双指针来循环遍历两数组中的元素
        while l1 < len(nums1) and l2 < len(nums2):
            # 判断当前两数组的指针所指的元素是否相同
            if nums1[l1] == nums2[l2]:
                # 若相同则将其添加到结果列表中,并将双指针往后移动一位
                result.append(nums1[l1])
                l1 += 1
                l2 += 1
            # 若当前 nums1 数组指针所指的元素小于 nums2,则将 l1 向后移动一位,即寻找相同元素
            elif nums1[l1] < nums2[l2]:
                l1 += 1
            # 反之则将 l2 指针向后移动一位
            else:
                l2 += 1
        # 返回结果
        return result
