'''
Author: Goog Tech
Date: 2020-08-30 17:19:55
LastEditTime: 2020-08-30 17:21:07
Description: https://leetcode-cn.com/problems/backspace-string-compare/
FilePath: \leetcode-googtech\#844. Backspace String Compare\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 本题主要考察双指针,这里利用栈结构来解答下吧嘿嘿😅
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        # 初始化两辅助栈,其用于存储 S 与 T 字符串中的字符
        slist, tlist = [], []
        # 遍历 S 字符串中的字符
        for i in range(len(S)):
            # 判断当前字符是否为符号 #
            if S[i] != '#':
                # 若是则将其压入栈中
                slist.append(S[i])
            # 判断当前字符是否为符号 # 且辅助栈是否为空
            elif S[i] == '#' and slist != []:
                # 若是则弹出栈顶元素,即删除符号 # 前的一个字符
                slist.pop()
        # 同上
        for j in range(len(T)):
            if T[j] != '#':
                tlist.append(T[j])
            elif T[j] == '#' and tlist != []:
                tlist.pop()
        # 判断两个辅助栈中的元素是否相同,并返回其结果
        return slist == tlist
