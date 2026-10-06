class Solution {
    public int[] searchRange(int[] arr, int key) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}