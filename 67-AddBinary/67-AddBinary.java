// Last updated: 10/25/2025, 2:43:00 PM
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int ii = 0; ii < 32; ii++) {
            res <<= 1; //adds another space to occupy
            res |= (n&1); //occupies that space with the last digit of n
            n >>= 1; // shifts n to the right to clear the copied last digit
        }
        return res;
    }
}