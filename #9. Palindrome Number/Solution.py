'''
@Author: Goog Tech
@Date: 2020-07-15 18:31:53
@Description: https://leetcode-cn.com/problems/palindrome-number/
@Reference: https://leetcode-cn.com/problems/palindrome-number/solution/chao-xiang-xi-tu-jie-san-chong-jie-fa-9-hui-wen-sh/
@FilePath: \leetcode-googtech\#9. Palindrome Number\Solution.py
'''
class Solution:
    # 反转一半数字
    def isPalindrome(self, x):
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        ans = 0
        while x > ans:
            ans = ans * 10 + x % 10
            x = x // 10
        return x == ans or x == (ans // 10)

# test
print(Solution().isPalindrome(121))
