'''
Author: Goog Tech
Date: 2020-08-15 09:38:40
LastEditTime: 2020-08-15 09:51:05
Description: https://leetcode-cn.com/problems/valid-palindrome/
FilePath: \leetcode-googtech\#125. Valid Palindrome\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=125 lang=python
#
# [125] 验证回文串
#

# @lc code=start
class Solution(object):

    '''
    截图思路如下:

    初始时左右指针分别指向 string 的两侧,随后我们不断地将这两个指针相向移动,
    每次移动一步,并判断这两个指针指向的字符是否相同.
    当这两个指针相遇时,就说明 string 是回文串.
    '''
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # 将字符串中的字符转换为小写,其中 isalnum() 方法用于检测字符串是否由字母和数字组成
        string = ''.join(ch.lower() for ch in s if ch.isalnum())
        # 初始化头尾双指针
        left, right = 0, len(string) - 1
        # 通过移动双指针来逐个判断头尾指针所指字符是否相等
        while left < right:
            if string[left] != string[right]: return False
            left, right = left + 1, right - 1
        return True
# @lc code=end
