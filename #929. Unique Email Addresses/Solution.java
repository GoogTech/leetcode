/*
 * @Author: Goog Tech
 * @Date: 2020-08-29 23:17:50
 * @LastEditTime: 2020-08-29 23:18:19
 * @Description: https://leetcode-cn.com/problems/unique-email-addresses/
 * @FilePath: \leetcode-googtech\#929. Unique Email Addresses\Solution.java
 * @WebSite: https://algorithm.show/
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails) {
            StringBuilder sb = new StringBuilder();
            // substring(int beginIndex, int endIndex)
            sb.append(email.substring(0, email.indexOf('+') == -1 ? email.indexOf('@') : email.indexOf('+')).replace(".", "")); 
            // substring(int beginIndex)
            sb.append(email.substring(email.indexOf('@'))); 
            set.add(sb.toString());
        }
        return set.size();
    }
}
