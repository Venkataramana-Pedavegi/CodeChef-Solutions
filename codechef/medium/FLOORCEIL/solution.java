class Solution {
    public int[] findFloorCeil(int[] arr, int k) {


        int low = 0;
        int high = arr.length - 1;

        int floor = -1;
        int ceil = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                // k itself is both floor and ceil
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }

            else if (arr[mid] < k) {
                // arr[mid] can be the floor
                floor = arr[mid];

                // Look for a larger value
                low = mid + 1;
            }

            else {
                // arr[mid] can be the ceil
                ceil = arr[mid];

                // Look for a smaller value
                high = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}

    

