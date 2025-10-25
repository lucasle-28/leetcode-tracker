// Last updated: 10/24/2025, 11:23:50 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for (int ii = 0; ii <= arr.length - k; ii++) {
            int sum = 0;
            for (int jj = 0; jj < k; jj++) {
                sum = sum + arr[jj + ii];
            }
            int avg = sum/k;
            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
}