/*
 * @Author: Goog Tech
 * @Date: 2020-07-25 12:26:56
 * @Description: https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * @FilePath: \leetcode-googtech\#628. Maximum Product of Three Numbers\Solution.java
 */ 
class Solution {
    public int maximumProduct(int[] nums) {
        // 初始化第一,第二以及第三大元素
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE,thirdMax = Integer.MIN_VALUE;
        // 初始化第一,第二以及第三小元素
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        // 遍历数组
        for(int num : nums) {
            // 获取第一,第二以及第三大元素
           if(num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
           }else if(num > secondMax) {
               thirdMax = secondMax;
               secondMax = num;
           }else if(num > thirdMax) {
               thirdMax = num;
           }
           // 获取第一,第二小元素
           if(num < firstMin) {
               secondMin = firstMin;
               firstMin = num;
           }else if(num < secondMin) {
               secondMin = num;
           }
        }
       // 有正有负有零: 最大3个数相乘 / 最小2个数(负负得正)与最大的1个数相乘
       return Math.max(firstMax * secondMax * thirdMax,firstMax * firstMin * secondMin);
    }
}
