/*
 * @Author: Goog Tech
 * @Date: 2020-08-24 15:26:19
 * @LastEditTime: 2020-08-24 15:27:02
 * @Description: https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @FilePath: \leetcode-googtech\#387. First Unique Character in a String\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {

    // 利用哈希表
    public int firstUniqChar(String s) {
        // 获取字符串的长度值
        int length = s.length();
        // 初始化HashMap,其中 key 存储字符,value 存储对应字符出现的次数
        Map<Character, Integer> map = new HashMap<>();
        // 遍历字符串,若当前字符在 map 中已存在,则获取对应字符出现的次数并加一,反之 value 为零
        for(int i = 0; i < length; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        // 再次遍历字符串,找到 map 中第一个出现次数为 1 的字符,然后返回其索引值
        for(int i = 0; i < length; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        // 无果
        return -1;
    }
}
