/*
 * @Author: Goog Tech
 * @Date: 2020-09-01 11:57:12
 * @LastEditTime: 2020-09-01 11:57:31
 * @Description: https://leetcode-cn.com/problems/next-greater-element-i/
 * @FilePath: \leetcode-googtech\#496. Next Greater Element I\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 解题思路: 先遍历 nums2 中的每一个元素,找出其下一个更大的元素,
    // 随后对于将这些答案放入哈希映射中,最后再遍历数组 nums1 直接找出答案
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 初始化辅助栈,其用于存储 nums2 数组中每个元素的右边第一个更大的元素值
        Stack<Integer> stack = new Stack<>();
        // 初始化 HashMap,其中 nums2 数组中的元素作为 key,其对应的右边第一个更大的元素作为 value
        HashMap<Integer, Integer> map = new HashMap<>();
        // 根据 nums1 数组的长度初始化结果数组
        int[] result = new int[nums1.length];
        // 逐个遍历 nums2 数组中的元素
        for(int i = 0; i < nums2.length; i++) {
            // 判断栈是否为空,并且当前元素是否大于栈顶元素
            while(!stack.isEmpty() && nums2[i] > stack.peek()) {
                // 若满足条件,则将栈顶元素弹出并将其作为 key,当前元素作为 value 存储到 HashMap 中
                map.put(stack.pop(), nums2[i]);
            }
            // 反之则说明当前元素在 nums2 数组中并不是栈顶元素右边第一个更大的元素,进而将其压入栈中
            stack.push(nums2[i]);
        }
        // 若遍历完毕后栈为空,则说明栈中的元素在 nums2 数组中并无右边第一个更大的元素, 
        // 进而通过循环弹出栈顶元素,并将其作为 key, -1 作为 value 存储到 HashMap 中
        while(!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        // 逐个遍历 nums1 数组中的元素,并通过将其作为 key 来获取 HashMap 中对应的 value,即对应的右边第一个更大的元素值
        for(int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        // 返回结果数组
        return result;
    }
}
