/*
 * @Author: Goog Tech
 * @Date: 2020-07-22 21:58:21
 * @Description: https://leetcode-cn.com/problems/remove-element/
 * @FilePath: \leetcode-googtech\#27. Remove Element\Solution.java
 */ 
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
