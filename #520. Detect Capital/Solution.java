/*
 * @Author: Goog Tech
 * @Date: 2020-07-24 18:35:09
 * @Description: https://leetcode-cn.com/problems/detect-capital/
 * @FilePath: \leetcode-googtech\#520. Detect Capital\Solution.java
 */ 
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ch = word.toCharArray();
        int upper = 0,lower = 0;
        // 通过比较ASCII的大小来统计字符串中大小写字符的所占的个数
        for(int i = 0;i < ch.length;i++) { 
            if(ch[i]>='a') lower++; else upper++;
        }
        // GOOGLE || google || Google
        return upper==ch.alength || lower==ch.length ||  (upper==1 && ch[0]<'a');
    }
}
