'''
Author: Goog Tech
Date: 2020-09-13 13:32:26
LastEditTime: 2020-09-13 13:33:19
Description: https://leetcode-cn.com/problems/employee-importance/
FilePath: \leetcode-googtech\#690. Employee Importance\Solution.py
WebSite: https://algorithm.show/
'''

"""
# Definition for Employee.
class Employee(object):
    def __init__(self, id, importance, subordinates):
    	#################
        :type id: int
        :type importance: int
        :type subordinates: List[int]
        #################
        self.id = id
        self.importance = importance
        self.subordinates = subordinates
"""

class Solution(object):
    # 使用辅助队列进行广度优先搜索( BFS )
    def getImportance(self, employees, id):
        """
        :type employees: List[Employee]
        :type id: int
        :rtype: int
        """
        # 初始化用于存储员工信息的 hashMap 集合
        # 初始化辅助队列,其用于存储每层每个员工信息的数据结构( 可将所有员工信息看作一个树结构 )
        # 初始化待查找员工所有下属的重要度之和的值
        hashMap, queue, s = {}, [id], 0
        # 逐个遍历员工信息,并将其添加到 hashMap 集合中
        for employee in employees: hashMap[employee.id] = employee
        # 判断当前辅助队列是否为空
        while queue:
            # 获取当前出队员工的 id,并根据 id 获取该员工信息中的 "重要度" 的值
            currentEmplpyeeId = queue.pop(0)
            s += hashMap[currentEmplpyeeId].importance
            # 然后再通过 id 获取其直系下属的 id,并通过遍历将其下属 id 逐个存储在队列中
            for subordinate in hashMap[currentEmplpyeeId].subordinates: queue.append(subordinate)
        # 返回结果
        return s
