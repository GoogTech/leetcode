/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 09:31:26
 * @LastEditTime: 2020-08-09 09:32:33
 * @Description: https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @FilePath: \leetcode-googtech\#349. Intersection of Two Arrays\Solution.java
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 初始化set集合
        Set<Integer> set = new HashSet<>();
        // 对数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 循环遍历两数组中的元素,若相同则将其加入到set集合中,反之则继续移动p1或p2指针
        int p1 = 0, p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length) {
            if(nums1[p1] == nums2[p2]) {
                set.add(nums1[p1]);
                p1++;
                p2++;
            }else if(nums1[p1] < nums2[p2]) {
                p1++;
            }else if(nums1[p1] > nums2[p2]) {
                p2++;
            }
        }
        // 将set集合转换为数组并返回
        int index = 0;
        int[] result = new int[set.size()];
        for(int num : set) {
            result[index++] = num;
        }
        return result;
    }
}
