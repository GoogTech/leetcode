/*
 * @Author: Goog Tech
 * @Date: 2020-09-13 13:32:22
 * @LastEditTime: 2020-09-13 13:32:56
 * @Description: https://leetcode-cn.com/problems/employee-importance/
 * @FilePath: \leetcode-googtech\#690. Employee Importance\Solution.java
 * @WebSite: https://algorithm.show/
 */

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    // 使用辅助队列进行广度优先遍历( BFS )
    public int getImportance(List<Employee> employees, int id) {
        // 初始化用于存储员工信息的 hashMap 集合
        Map<Integer, Employee> map = new HashMap<>();
        // 逐个遍历员工信息,并将其添加到 hashMap 集合中
        for(Employee employee : employees) map.put(employee.id, employee);
        // 初始化辅助队列,其用于存储每层每个员工信息的数据结构( 可将所有员工信息看作一个树结构 )
        Queue<Integer> queue = new LinkedList<>();
        // 将待查找的员工 id 入队
        queue.add(id);
        // 初始化当前层的员工个数及待查找员工所有下属的重要度之和的值
        int oneLevel = 1, sum = 0;
        // 判断当前辅助队列是否为空
        while(!queue.isEmpty()) {
            // 通过循环将队列中的元素,即员工信息结构逐个出队
            while(oneLevel-- > 0) {
                // 获取当前出队员工的 id,并根据 id 获取该员工信息中的 "重要度" 的值
                int tempId = queue.remove();
                sum += map.get(tempId).importance;
                // 然后再通过 id 获取其直系下属的 id,并通过遍历将其下属 id 逐个存储在队列中
                for(int subordinate : map.get(tempId).subordinates) queue.add(subordinate);
            }
            // 获取下一层员工的个数
            oneLevel = queue.size();
        }
        // 返回结果
        return sum;
    }
}
