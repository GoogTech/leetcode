/*
 * @Author: Goog Tech
 * @Date: 2020-08-21 10:34:22
 * @LastEditTime: 2020-08-21 10:34:45
 * @Description: https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * @FilePath: \leetcode-googtech\剑指 Offer\#50. 第一个只出现一次的字符\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 哈希表
    public char firstUniqChar(String s) {
        // 初始化hashMap
        HashMap<Character, Boolean> dic = new HashMap<>();
        // 将字符串转换为字符数组
        char[] chars = s.toCharArray();
        // 遍历字符数组,并将字符逐个存储到hashMap集合中
        // 其键用于存储字符,而值为布尔值,其用于存储字符出现的次数是否为1
        for(char c : chars) 
            dic.put(c, !dic.containsKey(c));
        // 再次遍历字符数组,取出第一个只出现一次的字符
        for(char c : chars) 
            if(dic.get(c)) return c;
        // 若无果则返回空格
        return ' ';
    }
}
