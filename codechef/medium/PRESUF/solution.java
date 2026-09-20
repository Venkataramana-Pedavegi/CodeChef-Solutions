import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static final long MOD = 1000000007L;

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] leftValue = new int[n];
        int[] rightValue = new int[n];

        // ---------------- PREFIX ----------------
        HashMap<Integer, Integer> freq = new HashMap<>();

        int distinct = 0;

        for (int i = 0; i < n; i++) {

            int count = freq.getOrDefault(a[i], 0) + 1;
            freq.put(a[i], count);

            if (count == 1) {
                distinct++;
            }

            int Pi = count;
            int Di = distinct;

            leftValue[i] = Di / 2 - Pi;
        }

        // ---------------- SUFFIX ----------------
        freq.clear();
        distinct = 0;

        for (int j = n - 1; j >= 0; j--) {

            int count = freq.getOrDefault(a[j], 0) + 1;
            freq.put(a[j], count);

            if (count == 1) {
                distinct++;
            }

            int Sj = count;
            int Ej = distinct;

            rightValue[j] = Ej / 2 - Sj;
        }

        // ---------------- COMPRESS LEFT VALUES ----------------
        int[] sorted = leftValue.clone();

        Arrays.sort(sorted);

        int size = 0;

        for (int x : sorted) {
            if (size == 0 || sorted[size - 1] != x) {
                sorted[size++] = x;
            }
        }

        FenwickTree bit = new FenwickTree(size);

        long answer = 0;

        // ---------------- COUNT VALID PAIRS ----------------
        for (int j = 0; j < n; j++) {

            // Add L[j-1], so only i < j are present
            if (j > 0) {

                int pos = lowerBound(
                    sorted, size, leftValue[j - 1]
                );

                bit.add(pos + 1, 1);
            }

            /*
             * L[i] + R[j] >= 0
             *
             * L[i] >= -R[j]
             */
            int required = -rightValue[j];

            // First position whose value >= required
            int pos = lowerBound(sorted, size, required);

            // Number of previous L values < required
            int less = bit.sum(pos);

            // Total previous elements = j
            // Therefore values >= required = j - less
            answer += j - less;

            answer %= MOD;
        }

        System.out.println(answer);
    }

    // First index where arr[index] >= target
    static int lowerBound(int[] arr, int size, int target) {

        int low = 0;
        int high = size;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // Fenwick Tree / Binary Indexed Tree
    static class FenwickTree {

        int[] tree;

        FenwickTree(int n) {
            tree = new int[n + 1];
        }

        void add(int index, int value) {

            while (index < tree.length) {

                tree[index] += value;

                index += index & -index;
            }
        }

        int sum(int index) {

            int result = 0;

            while (index > 0) {

                result += tree[index];

                index -= index & -index;
            }

            return result;
        }
    }
}