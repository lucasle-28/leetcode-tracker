// Last updated: 10/27/2025, 12:35:13 AM
class Solution {
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int count = 0;
        for (int ii = 0; ii < bin.length(); ii++) {
            if (bin.charAt(ii) == '1') {
                count++;
            }
        }
        return count;
    }
}