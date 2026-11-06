public static int solve(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        // Ensure mid is even to test the start of a pair
        if (mid % 2 != 0) {
            mid--;
        }

        // Check if the pair is intact
        if (nums[mid] == nums[mid + 1]) {
            // Unique element is in the right half
            low = mid + 2;
        } else {
            // Unique element is at mid or in the left half
            high = mid;
        }
    }

    return nums[low];
}