/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 14:34:53
 * @LastEditTime: 2020-08-16 14:51:09
 * @Description: https://leetcode-cn.com/problems/single-number-ii/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\137.只出现一次的数字-ii.java
 * @WebSite: https://algorithm.show/
 */
/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        // 初始化 Map 集合
        HashMap<Integer, Integer> map = new HashMap<>();
        // 将数组中的元素作为key,其出现的次数作为value存储到 hashMap 中
        // getOrDefault:若该元素不存在则返回0,反之返回对应数值出现次数并加1
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 遍历map的键值对,若键对应的值为1则返回该键,即结果数值
        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        // 无果
        return -1;
    }
}
// @lc code=end
