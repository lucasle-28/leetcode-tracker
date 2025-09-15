// Last updated: 9/15/2025, 1:26:35 AM
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        for (int ii = 0; ii < s.length(); ii++) {
            while (set.contains(s.charAt(ii))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(ii));
            if (ii-start + 1 > max) {
                max = ii-start+1;
            }
        }
        return max;
    }
}