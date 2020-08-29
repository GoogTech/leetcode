/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 17:48:14
 * @LastEditTime: 2020-08-29 17:48:33
 * @Description: https://leetcode-cn.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * @FilePath: \leetcode-googtech\#1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // 切割字符串并将其转化为字符数组
        String[] strs = sentence.split(" ");
        // 获取检索词的长度
        int length = searchWord.length();
        // 遍历字符数组
        for(int i = 0; i < strs.length; i++) {
            // 判断当前字符元素的长度是否大于检索词的长度,并且切割后的字符元素是否与检索词相同
            if(strs[i].length() >= length && strs[i].substring(0, length).equals(searchWord)) {
                // 若相同则返回句子 sentence 中该单词所对应的下标(下标从 1 开始)
                return i + 1;
            }
        }
        // 无果
        return -1;
    }
}
