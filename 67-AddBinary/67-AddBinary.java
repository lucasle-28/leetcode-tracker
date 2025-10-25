// Last updated: 10/25/2025, 2:48:55 PM
class Solution {
    public int hammingWeight(int n) {
        String strN = Integer.toBinaryString(n);
        int count = 0;
        for (int ii = 0; ii < strN.length();ii++) {
            if (strN.charAt(ii) == '1') {
                count++;
            }
        }
        return count;
    }
}