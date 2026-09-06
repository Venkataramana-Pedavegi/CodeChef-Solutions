class Solution {
    public int countNonMinimum(int[] nums) {
        // write your code here 
        if (nums.length == 0) return 0;

        int minimum = nums[0];
        int countMin = 0;

        // Find the minimum value in the array
        for (int num : nums) {
            if (num < minimum) {
                minimum = num;
            }
        }

        // Count how many times the minimum value appears
        for (int num : nums) {
            if (num == minimum) {
                countMin++;
        
    }
}
         return nums.length - countMin;
    }
}