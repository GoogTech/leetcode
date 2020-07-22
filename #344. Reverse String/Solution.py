'''
@Author: Goog Tech
@Date: 2020-07-22 18:03:26
@Description: https://leetcode-cn.com/problems/reverse-string/
@FilePath: \leetcode-googtech\#344. Reverse String\Solution.py
'''
class Solution(object):
    # 双指针法
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1
