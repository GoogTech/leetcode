/*
 * @Author: Goog Tech
 * @Date: 2020-08-09 07:42:42
 * @LastEditTime: 2020-08-09 07:43:54
 * @Description: https://leetcode-cn.com/problems/defanging-an-ip-address/
 * @FilePath: \leetcode-googtech\#1108. Defanging an IP Address\Solution.java
 */

class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        char[] chars = address.toCharArray();
        for(char c : chars) {
            sb = c == '.' ? sb.append("[.]") : sb.append(c);
        }
        return sb.toString();
    }
}
