class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Increasing slope → peak is on the right
                low = mid + 1;
            } 
            else {
                // Decreasing slope → peak is at mid or on the left
                high = mid;
            }
        }

        return low;
    }
}