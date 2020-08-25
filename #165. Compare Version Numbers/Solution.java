/*
 * @Author: Goog Tech
 * @Date: 2020-08-25 08:45:15
 * @LastEditTime: 2020-08-25 08:45:40
 * @Description: https://leetcode-cn.com/problems/compare-version-numbers/
 * @FilePath: \leetcode-googtech\#165. Compare Version Numbers\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int compareVersion(String version1, String version2) {
        // 根据点分割两个字符串并将其存储到数组中
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");
       历较长的数组
        for(int n = 0; n < Math.max(a1.length, a2.length); n++) {
            // 若其中一个数组先结束遍历了,则在其后添加零,进而可以继续与较长的数组进行比较
            int i = (n < a1.length ? Integer.valueOf(a1[n]) : 0);
            int j = (n < a2.length ? Integer.valueOf(a2[n]) : 0);
            // 若版本号不同则根据条件判断
            if(i != j) return i > j ? 1 : -1;
        }
        // 若版本号相同则返回零
        return 0;
    }
}
