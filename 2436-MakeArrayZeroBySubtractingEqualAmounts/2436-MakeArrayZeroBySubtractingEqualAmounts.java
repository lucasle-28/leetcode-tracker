// Last updated: 9/15/2025, 1:26:36 AM
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        for (int ii = 0; ii < nums.length; ii++) {
            int current = nums[ii];
            if (current != 0 && !h.contains(current)) {
                h.add(current);
            }
        }
        return h.size();
    }
}