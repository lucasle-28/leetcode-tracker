// Last updated: 10/25/2025, 3:40:29 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return ((n & (n - 1) )== 0);
    }
}