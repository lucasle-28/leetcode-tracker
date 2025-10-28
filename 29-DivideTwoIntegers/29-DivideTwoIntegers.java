// Last updated: 10/28/2025, 2:05:45 AM
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int ii = 0; ii < nums.length; ii++) {
            ans ^= nums[ii];
        }
        return ans;
    }
}