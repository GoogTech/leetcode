/*
 * @Author: Goog Tech
 * @Date: 2020-09-02 21:55:37
 * @LastEditTime: 2020-09-02 21:55:43
 * @Description: https://leetcode-cn.com/problems/water-bottles/
 * @FilePath: \leetcode-googtech\#1518. Water Bottles\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        while(emptyBottles >= numExchange) {
            numBottles = numBottles + emptyBottles / numExchange;
            emptyBottles = emptyBottles / numExchange + emptyBottles % numExchange;
        }
        return numBottles;
    }
}
