'''
@Author: Goog Tech
@Date: 2020-07-25 17:39:29
@Description: https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
@FilePath: \leetcode-googtech\#345. Reverse Vowels of a String\Solution.py
'''
class Solution(object):
    # 双指针法
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        # 声明用于匹配的元音列表
        patterns = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        # 初始化头部和尾部指针
        left = 0
        right = len(s) - 1
        # 将字符串转换为列表
        s = list(s)
        # 遍历列表
        while left < right:
            # 从左向右移动左指针,获取为元音字符的下标值
            while left < right and s[left] not in patterns:
                left = left + 1
            # 从右向左移动右指针,获取元音字符的下标值
            while right > left and s[right] not in patterns:
                right = right - 1
            # 反转列表中的元音字符并且继续移动头和尾部指针
            s[left], s[right] = s[right], s[left]
            left = left + 1
            right = right - 1
        # 返回结果
        return ''.join(s)


"""
Python join() 方法用于将序列(sequence)中的元素以指定的字符连接生成一个新的字符串
join()方法语法: str.join(sequence)

str = "-";
seq = ("a", "b", "c");
print str.join( seq );
"""
