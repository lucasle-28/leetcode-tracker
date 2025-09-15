// Last updated: 9/15/2025, 1:26:06 AM
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int[] solution = new int[2];
        for (int ii = 0; ii < nums.length; ii++) {
            int comp = target - nums[ii];
            if (h.containsKey(comp)) {
                solution[0] = ii;
                solution[1] = h.get(comp);
            }
            else {
                h.put(nums[ii],ii);
            }
        }
        return solution;
    }
}