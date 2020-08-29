/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 14:34:19
 * @LastEditTime: 2020-08-29 14:34:31
 * @Description: https://leetcode-cn.com/problems/unique-morse-code-words/
 * @FilePath: \leetcode-googtech\#804. Unique Morse Code Words\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // 初始化 26 个英文字母对应摩尔斯密码表
        String[] str=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // 初始化用于存储单词翻译结果的 HashSet 集合
        HashSet<String> set = new HashSet<>();
        // 遍历字符串数组
        for(String word : words) {
            // 遍历当前单词中的所有字符,对照摩斯密码进行逐个翻译
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                // 其中 c - a 的取值范围为 1 到 26
                sb.append(str[c - 'a']); 
            }
            // 将单词翻译的结果添加到结果集合中
            set.add(sb.toString());
        }
        // 返回结果集合中的已翻译的单词数(已去重)
        return set.size();
    }
}
