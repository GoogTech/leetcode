/*
 * @Author: Goog Tech
 * @Date: 2020-07-15 18:31:44
 * @Description: https://leetcode-cn.com/problems/palindrome-number/
 * @Reference: https://leetcode-cn.com/problems/palindrome-number/solution/chao-xiang-xi-tu-jie-san-chong-jie-fa-9-hui-wen-sh/
 * @FilePath: \leetcode-googtech\#9. Palindrome Number\Solution.java
 */ 
class Solution{
    // 取模运算
    public boolean isPalindrome(int x){
        final int ans = x;
        if(ans < 0){
            return false;
        }
        int res = 0;
        while(x != 0){
            res = res * 10 + x % 10; //1(0+1), 12(1+2), 121(12+1)
            x = x / 10; // 12, 1, 0
        }
        return res == ans ? true : false;
    }

    // test
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121)); //True
    }
}
