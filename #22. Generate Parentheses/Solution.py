'''
Author: Goog Tech
Date: 2020-10-27 16:14:18
LastEditTime: 2020-10-27 16:15:08
Description: https://leetcode-cn.com/problems/generate-parentheses/
FilePath: \leetcode-googtech\#22. Generate Parentheses\Solution.py
WebSite: https://algorithm.show/
Reference: https://leetcode-cn.com/problems/generate-parentheses/solution/hui-su-suan-fa-by-liweiwei1419/
'''
class Solution(object):
    # DFS : 深度优先搜索算法
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result, string = [], ''
        def dfs(left, right, string):
            # 在左边和右边剩余的括号数都等于 0 的时候结算
            if left == 0 and right == 0:
                result.append(string)
                return
            # 生成右枝叶的条件是: 左括号剩余数量小于右括号剩余数量
            if right < left: return 
            # 当前左右括号都有大于 0 个可以使用的时候,才产生分支
            if left > 0: dfs(left - 1, right, string + '(')
            if right > 0: dfs(left, right - 1, string + ')')
        dfs(n, n , string)
        return result
