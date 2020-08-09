'''
Author: Goog Tech
Date: 2020-08-09 09:31:38
LastEditTime: 2020-08-09 09:33:23
Description: https://leetcode-cn.com/problems/intersection-of-two-arrays/
FilePath: \leetcode-googtech\#349. Intersection of Two Arrays\Solution.py
'''

class Solution(object):

    # 双指针法
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # 判断数组是否为空
        if not nums1 or not nums2: return []
        # 获取数组长度
        nums1Len = len(nums1)
        nums2Len = len(nums2)
        # 初始化双指针
        p1, p2 = 0, 0
        # 初始化结果集合(题目要求: 输出结果中的每个元素一定是唯一的)
        res = set() 
        # 对数组进行排序
        nums1, nums2 = sorted(nums1), sorted(nums2)
        # 循环遍历两数组中的元素,如果两元素相同则将其加入到set结合中,反之则继续移动p1或这p2指针
        while p1 < nums1Len and p2 < nums2Len:
            if nums1[p1] == nums2[p2]:
                res.add(nums1[p1])
                p1 += 1
                p2 += 1
            elif nums1[p1] > nums2[p2]:
                p2 += 1
            else:
                p1 += 1
        # 将结果转换为列表并返回
        return list(res)
