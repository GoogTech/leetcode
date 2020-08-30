/*
 * @Author: Goog Tech
 * @Date: 2020-08-30 22:45:37
 * @LastEditTime: 2020-08-30 22:45:49
 * @Description: https://leetcode-cn.com/problems/find-closest-lcci/
 * @FilePath: \leetcode-googtech\面试题17\#11. 单词距离\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 双指针法
    public int findClosest(String[] words, String word1, String word2) {
        // 初始化双指针以及最短距离值
        int indexWord1 = -1, indexWord2 = -1, minDistance = 0;
        // 逐个遍历字符串数组中的单词
        for(int i = 0; i < words.length; i++) {
            // 若当前单词与 word1 / word2 相同,则将其下标值赋值给 indexWord1 / indexWord2
            if(words[i].equals(word1)) indexWord1 = i;
            if(words[i].equals(word2)) indexWord2 = i;
            // 判断双指针是否发生了变化
            if(indexWord1 != -1 && indexWord2 != -1) {
                // 若最短距离值仍未零,则取双指针差值后的绝对值,并将其赋值给 minDistance
                if(minDistance == 0) minDistance = Math.abs(indexWord1 - indexWord2);
                // 若最短距离不为零,则取双指针差值后的绝对值,并将其与上个 minDistance 比较,取其最小值
                minDistance = Math.min(minDistance, Math.abs(indexWord1 - indexWord2));
            }
        }
        // 返回最小距离值
        return minDistance;
    }
}
