/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 16:59:28
 * @LastEditTime: 2020-08-29 16:59:55
 * @Description: https://leetcode-cn.com/problems/check-permutation-lcci/
 * @FilePath: \leetcode-googtech\面试题01\#02. 判定是否互为字符重排\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1 == s2) return true;
        if(s1 == null || s2 == null || s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }
}
