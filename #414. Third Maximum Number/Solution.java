/*
 * @Author: Goog Tech
 * @Date: 2020-07-25 10:45:27
 * @Description: https://leetcode-cn.com/problems/third-maximum-number/
 * @FilePath: \leetcode-googtech\#414. Third Maximum Number\Solution.java
 */ 
class Solution {
    // Long.MIN_VALUE=-9223372036854775808(-2的63次方)
    private long MIN_VALUE = Long.MIN_VALUE;
    public int thirdMax(int[] nums) {
        // 初始化第一,第二以及第三大元素
        long firstElement = MIN_VALUE,secondElement = MIN_VALUE,thirdElement = MIN_VALUE;
        // 遍历数组,获取第一,第二以及第三大元素
        for(int num : nums) {
            if(num > firstElement) {
                thirdElement = secondElement;
                secondElement = firstElement;
                firstElement = num;
            }else if(secondElement < num && num < firstElement) {
                thirdElement = secondElement;
                secondElement = num;
            }else if (thirdElement < num && num < secondElement) {
                thirdElement = num;
            }
        }
        // 若无第三大元素则返回数组中的最大值
        return thirdElement==MIN_VALUE ? (int)firstElement : (int)thirdElement;
    }
}
