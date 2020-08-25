'''
Author: Goog Tech
Date: 2020-08-25 08:45:21
LastEditTime: 2020-08-25 08:45:52
Description: https://leetcode-cn.com/problems/compare-version-numbers/
FilePath: \leetcode-googtech\#165. Compare Version Numbers\Solutoin.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        # 根据点分割两个字符串并将其存储到数组中
        nums1, nums2 = version1.split('.'), version2.split('.')
        # 获取两个字符串的长度
        n1, n2 = len(nums1), len(nums2)
        # 遍历较长的数组
        for i in range(max(n1, n2)):
            # 若其中一个数组先结束遍历了,则在其后添加零,进而可以继续与较长的数组进行比较
            v1 = int(nums1[i]) if i < n1 else 0
            v2 = int(nums2[i]) if i < n2 else 0
            # 若版本号不同则根据条件判断
            if v1 != v2: return 1 if v1 > v2 else -1
        # 若版本号相同则返回零
        return 0
