/*
 * @Author: Goog Tech
 * @Date: 2020-08-22 09:30:44
 * @LastEditTime: 2020-08-22 09:31:02
 * @Description: https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 * @FilePath: \leetcode-googtech\#1299. Replace Elements with Greatest Element on Right Side\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int[] replaceElements(int[] arr) {
        // 初始化最大值
        int max = -1; 
        // 从后往前遍历数组元素
        for(int i = arr.length - 1; i >= 0; i--) {
            // 定义一个临时变量用于跟踪最大值
            int temp = arr[i];
            // 将每个元素用它右边最大的元素替换
            arr[i] = max;
            // 若当前元素大于最大值则重新初始化最大值
            if(temp > max) {
                max = temp; 
            }
        }
        // 返回结果数组
        return arr; 
    }
}
