/*
 * @Author: Goog Tech
 * @Date: 2020-07-22 17:09:50
 * @Description: https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * @FilePath: \leetcode-googtech\#1491. Average Salary Excluding the Minimum and Maximum Salary\Solution.java
 */ 
class Solution {
    public double average(final int[] salary) {
        double min = salary[0];
        double max = salary[0];
        double sum = 0.0;
        // 遍历相加数组中的元素,并找出最值
        for(int i = 0;i < salary.length;i++) {
            min = Math.min(min,salary[i]);
            max = Math.max(max,salary[i]);
            sum += salary[i];
        }
        // 返回平均值
        return (sum-max-min)/(salary.length - 2.0);
    }
}
