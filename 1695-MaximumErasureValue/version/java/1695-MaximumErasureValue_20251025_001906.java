// Last updated: 10/25/2025, 12:19:06 AM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int window = 0;
        int sums = 0;
        int max = 0;
        Set<Integer> ars = new HashSet<>();
        for (int ii = 0; ii < nums.length; ii++) {
            while (ars.contains(nums[ii])) {
                ars.remove(nums[window]);
                sums -= nums[window];
                window++;
            }
            ars.add(nums[ii]);
            sums += nums[ii];
            max = Math.max(max,sums);
        }
        return max;
    }
}