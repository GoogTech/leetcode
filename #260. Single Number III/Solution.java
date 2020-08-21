/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 21:03:48
 * @LastEditTime: 2020-08-21 21:06:07
 * @Description: https://leetcode-cn.com/problems/single-number-iii/
 * @FilePath: \leetcode-googtech\#260. Single Number III\Solution.java
 * @WebSite: https://algorithm.show/
 */
class Solution {
    
    // 哈希表法
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        // 遍历数组,若当前元素在set集合中已存在则将其移除
        // 反之将其添加到set集合中
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        // 将set集合中存储的两个元素转存到结果数组中
        int[] result = new int[2];
        int index = 0;
        for(int element : set) {
            result[index++] = element;
        }
        // 返回结果数组
        return result;
    }
}
