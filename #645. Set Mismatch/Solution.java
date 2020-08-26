/*
 * @Author: Goog Tech
 * @Date: 2020-08-26 13:00:38
 * @LastEditTime: 2020-08-26 13:04:46
 * @Description: https://leetcode-cn.com/problems/set-mismatch/
 * @FilePath: \leetcode-googtech\#645. Set Mismatch\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 使用额外数组法
    public int[] findErrorNums(int[] nums) {
        // 初始化计数数组
        int[] counter = new int[nums.length + 1];
        // 遍历 nums 数组,将其元素值作为 counter 数组的索引值,而将每个元素出现的次数作为其元素值
        for(int num : nums) counter[num]++;
        // 初始化结果数组
        int[] result = new int[2];
        // 遍历计数数组
        for(int i = 1; i < counter.length; i++) {
            // 若当前索引下的元素值等于零则证明当前索引值即为丢失的数值
            if(counter[i] == 0) {
                result[1] = i;
            // 若等于二则证明当前索引值即为重复出现的数值
            } else if(counter[i] == 2) {
                result[0] = i;
            }
        }
        // 返回结果数组
        return result;
    }
}
