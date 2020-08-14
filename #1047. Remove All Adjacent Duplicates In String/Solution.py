'''
Author: Goog Tech
Date: 2020-08-14 14:17:54
LastEditTime: 2020-08-14 14:40:50
Description: https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
FilePath: \leetcode-googtech\#1047. Remove All Adjacent Duplicates In String\Solution.py
WebSite: https://algorithm.show/
'''

#
# @lc app=leetcode.cn id=1047 lang=python
#
# [1047] 删除字符串中的所有相邻重复项
#

# @lc code=start
class Solution(object):
    def removeDuplicates(self, S):
        """
        :type S: str
        :rtype: str
        """
        stack = []
        # 循环遍历栈中元素
        for c in S:
            # 若当前字母与栈顶元素相同,则弹出栈顶元素
            if stack and c == stack[-1]:
                stack.pop()
            # 反之将其继续存储到栈中
            else:
                stack.append(c)
        # 最后将其转换为字符串并返回
        return ''.join(stack)
# @lc code=end
