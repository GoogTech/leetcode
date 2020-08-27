/*
 * @Author: Goog Tech
 * @Date: 2020-08-27 16:45:05
 * @LastEditTime: 2020-08-27 16:45:42
 * @Description: https://leetcode-cn.com/problems/find-all-duplicates-in-an-array/
 * @FilePath: \leetcode-googtech\#442. Find All Duplicates in an Array\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 原地修改法
    public List<Integer> findDuplicates(int[] nums) {
        // 初始化结果列表
        List<Integer> result = new ArrayList<>();
        // 遍历数组
        for(int i = 0; i < nums.length; i++) {
            // 取当前元素的绝对值
            int num = Math.abs(nums[i]);
            // 将当前元素 num 减一作为下标值,求出 nums 数组中对应的元素值
            if(nums[num - 1] > 0) {
                // 若得到的元素值为正则取其相反数
                nums[num - 1] *= -1;
            }else {
                // 若为负则说明该元素已经出现过,进而将其存储到结果列表中
                result.add(num);
            }
        }
        // 返回结果
        return result;
    }
}
