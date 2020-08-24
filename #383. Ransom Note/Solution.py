'''
Author: Goog Tech
Date: 2020-08-24 16:26:37
LastEditTime: 2020-08-24 16:28:45
Description: https://leetcode-cn.com/problems/ransom-note/
FilePath: \leetcode-googtech\#383. Ransom Note\Solution.py
WebSite: https://algorithm.show/
'''

class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        # 遍历ransomNote中的元素,判断当前元素在ransomNote中出现的次数大于magazine
        for ch in set(ransomNote):
            if ransomNote.count(ch) > magazine.count(ch):
                return False
        return True
