import java.util.*;

public class Main {

    public static long countPairsLessThanX(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        long count = 0;

        while (left < right) {

            if (arr[left] + arr[right] < x) {

                // All elements between left and right
                // can form a valid pair with arr[left]
                count += right - left;

                left++;

            } else {

                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(countPairsLessThanX(arr, x));

        sc.close();
    }
}