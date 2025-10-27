// Last updated: 10/27/2025, 12:33:19 AM
class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int ii = 0; ii < 32; ii++) {
            result <<= 1;
            result |= (n&1);;
            n >>>= 1;
        }
        return result;
    }
}