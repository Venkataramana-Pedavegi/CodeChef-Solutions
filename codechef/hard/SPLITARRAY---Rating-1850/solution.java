class Solution {
    public long splitArray(int[] nums, int K) {
        long low = 0;
        long high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canSplit(nums, K, mid)) {
                ans = mid;
                high = mid - 1; // Try to minimize the maximum sum
            } else {
                low = mid + 1;  // Allowed sum is too small, increase it
            }
        }

        return ans;
    }

    private boolean canSplit(int[] nums, int K, long maxSum) {
        int count = 1;
        long currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return count <= K;
    }
}