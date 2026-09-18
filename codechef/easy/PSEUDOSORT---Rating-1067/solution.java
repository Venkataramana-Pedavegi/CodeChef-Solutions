import java.util.*;

class Main {

    static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Already sorted
            if (isSorted(A)) {
                System.out.println("YES");
                continue;
            }

            // Find first violation
            int index = -1;

            for (int i = 0; i < N - 1; i++) {
                if (A[i] > A[i + 1]) {
                    index = i;
                    break;
                }
            }

            // Swap adjacent elements
            int temp = A[index];
            A[index] = A[index + 1];
            A[index + 1] = temp;

            // Check again
            if (isSorted(A)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}