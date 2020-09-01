'''
Author: Goog Tech
Date: 2020-09-01 16:15:14
LastEditTime: 2020-09-01 16:18:00
Description: https://leetcode-cn.com/problems/next-greater-element-ii/
FilePath: \leetcode-googtech\#503. Next Greater Element II\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):

    # 解题思路: 首先需要解决的问题是如何实现循环数组,即 “最后一个元素的下一个元素是数组的第一个元素”.
    # 事实上,我们只要能遍历两遍数组,效果就等同于循环.
    # 虽然创建一个长度为原数组二倍的数组也可以,但为了额外空间尽可能少,
    # 这里采用取模的方式,将索引限制在小于数组长度的正整数范围内.
    def nextGreaterElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # 判断数组是否为空
        if not nums: return []
        # 获取数组的长度
        numsLength = len(nums)
        # 逐个遍历并初始化数组元素
        result = [-1] * numsLength
        # 初始化辅助栈,栈顶至栈底由小到大
        stack = []
        # 逐个遍历数组元素,采用取模的方式将索引限制在小于数组长度的正整数范围内
        for i in range(2 * len(nums)):
            # 例如 numsLength 为 5, 则 index 的取值为 0,1,2,3,4,0,1,2,3,4 即遍历两遍数组,效果就等同于循环
            index = i % numsLength
            # 判断栈是否为空,并且当前元素是否大于栈顶元素
            while stack and nums[stack[-1]] < nums[index]:
                # 若满足条件则将弹出栈顶元素 index,而 nums[index] 则作为对应的元素值存储到结果数组
                result[stack.pop()] = nums[index]
            # 反之则说明栈顶元素在 nums 数组中并无下一个更的大元素,进而将当前元素的下标值压入栈中
            stack.append(index)
        # 返回结果数组
        return result
