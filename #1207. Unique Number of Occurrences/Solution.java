/*
 * @Author: Goog Tech
 * @Date: 2020-08-16 10:23:22
 * @LastEditTime: 2020-08-16 10:38:07
 * @Description: https://leetcode-cn.com/problems/unique-number-of-occurrences/
 * @FilePath: \leetcode-googtech\#102. Binary Tree Level Order Traversal\1207.独一无二的出现次数.java
 * @WebSite: https://algorithm.show/
 */

/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        // 使用 Map 集合记录每个数值及其出现的次数
        Map<Integer, Integer> countMap = new HashMap<>();
        // 记录每个数字出现的次数,数值作为键,其出现的次数作为值
        for(int num : arr) {
            // getDefault: 不存在则返回0,否则返回键num对应的值并加一
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        // 使用 Set 集合判断 Map 中键所对应的值是否右重复
        Set<Integer> set = new HashSet<>();
        // 判断value是否有重复值
        for(Integer value : countMap.values()) {
            // 若value值已存在,add方法则会返回false
            if(!set.add(value)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
