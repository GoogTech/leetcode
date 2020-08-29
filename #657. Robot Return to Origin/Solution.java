/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 13:57:43
 * @LastEditTime: 2020-08-29 13:58:01
 * @Description: https://leetcode-cn.com/problems/robot-return-to-origin/
 * @FilePath: \leetcode-googtech\#657. Robot Return to Origin\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public boolean judgeCircle(String moves) {
        int col = 0, row = 0;
        for(char ch : moves.toCharArray()) {
            if(ch == 'U') row++;
            else if(ch == 'D') row--;
            else if(ch == 'L') col++;
            else col--;
        }
        return row == 0 && col == 0;
    }
}
