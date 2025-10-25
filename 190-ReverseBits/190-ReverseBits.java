// Last updated: 10/25/2025, 2:26:37 PM
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int ii = 0; ii < 32; ii++) {
            res <<= 1;
            res |= (n&1);
            n >>= 1;
        }
        return res;
    }
}