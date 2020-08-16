/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 09:49:53
 * @LastEditTime: 2020-08-16 09:50:12
 * @Description: https://leetcode-cn.com/problems/array-partition-i/
 * @FilePath: \leetcode-googtech\#561. Array Partition I\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    //其实就是把从a1到an数组下标为奇数的数都加起来
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
