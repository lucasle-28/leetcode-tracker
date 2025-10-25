// Last updated: 10/24/2025, 10:47:50 PM
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int ii = 0; ii < s.length() - 2; ii++) {
            if (s.charAt(ii) != s.charAt(ii+1) && s.charAt(ii) != s.charAt(ii+2) && s.charAt(ii+1) != s.charAt(ii+2)) {
                count++;
            }
        }
        return count;
    }
}