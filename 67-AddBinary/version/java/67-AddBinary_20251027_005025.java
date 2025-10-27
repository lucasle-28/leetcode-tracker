// Last updated: 10/27/2025, 12:50:25 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }
}