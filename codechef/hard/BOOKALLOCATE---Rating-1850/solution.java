static long allocateBooks(long[] books, int N, int M) {
    if (M > N) {
        return -1;
    }

    long low = 0;
    long high = 0;

    for (int i = 0; i < N; i++) {
        low = Math.max(low, books[i]);
        high += books[i];
    }

    long ans = high;

    while (low <= high) {
        long mid = low + (high - low) / 2;

        if (canAllocate(books, N, M, mid)) {
            ans = mid;
            high = mid - 1; // Try for a smaller maximum
        } else {
            low = mid + 1;  // Increase the capacity
        }
    }

    return ans;
}

private static boolean canAllocate(long[] books, int N, int M, long maxPages) {
    int studentsRequired = 1;
    long currentPages = 0;

    for (int i = 0; i < N; i++) {
        if (books[i] > maxPages) {
            return false;
        }

        if (currentPages + books[i] > maxPages) {
            studentsRequired++;
            currentPages = books[i];

            if (studentsRequired > M) {
                return false;
            }
        } else {
            currentPages += books[i];
        }
    }

    return true;
}
