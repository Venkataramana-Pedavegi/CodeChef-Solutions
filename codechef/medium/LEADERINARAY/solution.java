class Solution {
    public List<Integer> findLeaders(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] > maxRight) {
                result.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(result);

        return result;
    }
}