// Last updated: 9/15/2025, 1:26:35 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        for (int ii = 0; ii < nums.length; ii++) {
            if (h.contains(nums[ii])) {
                return true;
            }
            else {
                h.add(nums[ii]);
            }
        }
        return false;
    }
}