static long minTime(int A, int B, long[] C) {
    long mod = 10000003L;
    long low = 0;
    long high = 0;

    for (long len : C) {
        low = Math.max(low, len);
        high += len;
    }

    long minMaxLen = high;

    while (low <= high) {
        long mid = low + (high - low) / 2;

        if (canPaint(C, A, mid)) {
            minMaxLen = mid;
            high = mid - 1; // Try for a smaller maximum workload
        } else {
            low = mid + 1;  // Need higher capacity per painter
        }
    }

    return ((minMaxLen % mod) * (B % mod)) % mod;
}

private static boolean canPaint(long[] C, int maxPainters, long maxCapacity) {
    int paintersUsed = 1;
    long currentLoad = 0;

    for (long len : C) {
        if (currentLoad + len <= maxCapacity) {
            currentLoad += len;
        } else {
            paintersUsed++;
            currentLoad = len;

            if (paintersUsed > maxPainters) {
                return false;
            }
        }
    }

    return true;
}