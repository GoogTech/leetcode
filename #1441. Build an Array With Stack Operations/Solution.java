/*
 * @Author: Goog Tech
 * @Date: 2020-09-01 20:10:12
 * @LastEditTime: 2020-09-01 20:10:32
 * @Description: https://leetcode-cn.com/problems/build-an-array-with-stack-operations/
 * @FilePath: \leetcode-googtech\#1441. Build an Array With Stack Operations\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        // 初始化结果列表
        List<String> result = new LinkedList<>();
        // 初始化数组下标
        int i = 0;
        // 遍历 1 到 N 之间所有的数值
        for(int j = 1; j <= n; j++) {
            // 若当前数组下标与数组长度值相同则跳出并结束循环
            if(i == target.length) {
                break;
            }
            // 若当前下标所指的数组元素与当前 j 值相同,
            // 则将 Push 字符存储到结果列表中,并向后移动数组元素指针
            if(target[i] == j) {
                result.add("Push");
                i++;
            // 反之则说明数组中缺失当前数值 j
            }else {
                result.add("Push");
                result.add("Pop");
            }
        }
        // 返回结果列表
        return result;
    }
}
