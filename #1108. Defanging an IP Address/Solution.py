'''
Author: Goog Tech
Date: 2020-08-09 07:42:47
LastEditTime: 2020-08-09 07:43:15
Description: https://leetcode-cn.com/problems/defanging-an-ip-address/
FilePath: \leetcode-googtech\#1108. Defanging an IP Address\Solution.py
'''

class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        return address.replace('.', '[.]')
