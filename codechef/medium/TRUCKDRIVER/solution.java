public static int findSmallestDivisor(int[] A, int T) {
    int low = 1;
    int high = 1;
    for (int num : A) {
        if (num > high) {
            high = num;
        }
    }

    int ans = high;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        long sum = 0;
        for (int num : A) {
            sum += (num + mid - 1) / mid;
        }

        if (sum <= T) {
            ans = mid;         // mid is a valid divisor; try finding a smaller one
            high = mid - 1;
        } else {
            low = mid + 1;     // sum is too large; increase the divisor
        }
    }

    return ans;
}