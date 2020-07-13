'''
@Author: Goog Tech
@Date: 2020-07-13 21:49:08
@Description: #1. Two Sum
@FilePath: \leetcode-googtech\#1. Two Sum\Solution.py
'''
class Solution:
    ''' 暴力法 '''
    def twoSum(self, nums, target):
        n = len(nums)
        for x in range(n):
            for y in range(x + 1, n):
                if (nums[x] + nums[y] == target):
                    return x, y
                    break
                else:
                    continue

''' 测试 '''
print(Solution().twoSum([2, 7, 11, 15], 9)) # (0, 1)
