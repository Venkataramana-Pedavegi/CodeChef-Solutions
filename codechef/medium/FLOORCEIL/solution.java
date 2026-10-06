class Solution {
    public int[] findFloorCeil(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        int floor = -1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                floor = k;
                ceil = k;
                break;
            } 
            else if (arr[mid] < k) {
                floor = arr[mid];
                low = mid + 1;
            } 
            else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}