/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 16:36:47
 * @LastEditTime: 2020-08-30 16:37:05
 * @Description: https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @FilePath: \leetcode-googtech\#350. Intersection of Two Arrays II\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    
    // 双指针法
    public int[] intersect(int[] nums1, int[] nums2) {
        // 分别对两个数组进行排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 初始化用于存储交集元素的 list 集合
        List<Integer> list = new ArrayList<>();
        // 初始化双指针并遍历数组元素
        for(int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            // 若当前 nums1 数组指针 i 所指元素小于 nums2 中指针 j 所指的元素,则将 i 向后移动一位
            if(nums1[i] < nums2[j]) {
                i++;
            // 反之则将 nums2 数组指针 j 向后移动一位
            }else if(nums1[i] > nums2[j]) {
                j++;
            // 若相同则将当前指针所指元素添加到 list 集合中,并将双指针向后移动一位
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        // 根据集合长度初始化结果数组,并通过遍历集合中的元素将其添加到结果数组中
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        // 返回结果数组
        return result;
    }
}
