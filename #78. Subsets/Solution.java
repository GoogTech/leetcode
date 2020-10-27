/*
 * @Author: Goog Tech
 * @Date: 2020-10-27 14:18:51
 * @LastEditTime: 2020-10-27 14:24:07
 * @Description: https://leetcode-cn.com/problems/subsets/
 * @FilePath: \leetcode-googtech\#78. Subsets\Solution.java
 * @WebSite: https://algorithm.show/
 * @Reference: https://leetcode-cn.com/problems/subsets/solution/hui-su-wei-yun-suan-di-gui-deng-gong-4chong-fang-s/
 */
class Solution {
    // 迭代
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 首先添加一个空集合
        result.add(new ArrayList<>());
        // 遍历原数组中的元素
        for(int i = 0; i < nums.length; i++) {
            // 获取结果集合的大小
            int all = result.size();
            // 每遍历一个元素,就在之前结果集合中的每个子集中追加这个元素,让它变成新的子集
            for(int j = 0; j < all; j++) {
                // 遍历之前的结果子集,并将其重新封装成一个新的子集
                List<Integer> temp = new ArrayList<>(result.get(j));
                // 然后在新的子集后面追加这个元素
                temp.add(nums[i]);
                // 最后把这个新的子集添加到结果集合中
                result.add(temp);
            }
        }
        // 返回结果集合
        return result;
    }
}
