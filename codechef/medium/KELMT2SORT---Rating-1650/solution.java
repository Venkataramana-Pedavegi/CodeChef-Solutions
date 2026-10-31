static class Solution {
    public long kthElement(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;

        // Ensure binary search is performed on the smaller array for O(log(min(M, N)))
        if (m > n) {
            return kthElement(b, a, k);
        }

        // low: minimum elements we can take from array `a`
        // high: maximum elements we can take from array `a`
        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int cutA = low + (high - low) / 2;
            int cutB = k - cutA;

            long leftA = (cutA == 0) ? Long.MIN_VALUE : a[cutA - 1];
            long leftB = (cutB == 0) ? Long.MIN_VALUE : b[cutB - 1];

            long rightA = (cutA == m) ? Long.MAX_VALUE : a[cutA];
            long rightB = (cutB == n) ? Long.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return -1;
    }
}