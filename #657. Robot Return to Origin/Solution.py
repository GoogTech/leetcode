'''
Author: Goog Tech
Date: 2020-08-29 13:57:51
LastEditTime: 2020-08-29 13:58:16
Description: https://leetcode-cn.com/problems/robot-return-to-origin/
FilePath: \leetcode-googtech\#657. Robot Return to Origin\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def judgeCircle(self, moves):
        """
        :type moves: str
        :rtype: bool
        """
        return moves.count('L') == moves.count('R') and moves.count('U') == moves.count('D')
