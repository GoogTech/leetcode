/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 20:36:30
 * @LastEditTime: 2020-08-21 20:36:47
 * @Description: https://leetcode-cn.com/problems/contains-duplicate/
 * @FilePath: \leetcode-googtech\#217. Contains Duplicate\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 利用 HashSet 集合判断数组中是否还有重复元素
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for(int num : nums) result.add(num);
        return result.size() == nums.length ? false : true;
    }
}
